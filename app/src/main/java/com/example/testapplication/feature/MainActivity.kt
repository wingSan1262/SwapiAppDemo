package com.example.testapplication.feature

import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testapplication.base_component.base_classes.BaseActivity
import com.example.testapplication.base_component.entities.ResourceState
import com.example.testapplication.base_component.extension.*
import com.example.testapplication.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import vanrrtech.app.ajaib_app_sample.domain.data_model.github.request.SearchPeopleRequest
import vanrrtech.app.ajaib_app_sample.domain.data_model.github.response.PeopleListModel
import javax.inject.Inject

class MainActivity : BaseActivity<ActivityMainBinding>() {

    @Inject
    lateinit var searchViewModel: SearchViewModel
    var adapter = SearchListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        activityComponent.inject(this)
        bindThisView(this, layoutInflater, null)
        super.onCreate(savedInstanceState)
        initUi()
        observeDatas()
    }

    override fun onDestroy() {
        searchViewModel.onDestroy()
        super.onDestroy()
    }

    fun initUi(){
        withBinding{
            listRv.let {
                it.layoutManager = LinearLayoutManager(this@MainActivity,
                    LinearLayoutManager.VERTICAL,
                    false)
                it.isNestedScrollingEnabled = false
                it.adapter = adapter
            }
            listRv.addOnBottomScrollListener {
                if(!searchViewModel.isQuerying){
                    if(searchViewModel.maxCount > adapter.listItems.size){
                        showLoading()
                        searchViewModel.currentPage = searchViewModel.currentPage + 1
                        searchViewModel.searchPeopleData(
                            SearchPeopleRequest(
                                searchViewModel.currentQuerySearch,
                                searchViewModel.currentPage
                            )
                        ) } }
            }
            searchField.textChanges()?.debounce(400)?.onEach { s ->
                searchViewModel.currentPage = 1
                if (s.isNullOrBlank()) {
                    if(searchViewModel.currentQuerySearch.isEmpty()){
                        searchViewModel.searchPeopleData(
                            SearchPeopleRequest(
                                searchViewModel.currentQuerySearch,
                                searchViewModel.currentPage
                            )
                        ); searchViewModel.currentQuerySearch = ""
                        return@onEach
                    }
                }
                searchViewModel.currentQuerySearch = s.toString()
                searchViewModel.searchPeopleData(
                    SearchPeopleRequest(
                        s.toString(),
                        searchViewModel.currentPage,
                    )
                )
            }?.launchIn(lifecycleScope)
        }
    }

    fun updateList(data: PeopleListModel) {
        if(data.results?.isEmpty() == true){
            showSnackBar(viewBinding.root, "no user found here sorry . . .")
            return
        }
        if(searchViewModel.currentPage <= 1)
            adapter.clearList()

        searchViewModel.maxCount = data.count
        lifecycleScope.launch {
            withBinding {
                showLoading()
                listRv.setVisibility(true)
            }
            data.results?.let {
                if(searchViewModel.currentQuerySearch.isEmpty() && searchViewModel.isFirstOpen)
                    it?.asReversed()?.forEach {
                        adapter?.insertAtTop(it)
                        delay(50)
                        withBinding { listRv.smoothScrollToPosition(0) }
                    } else adapter?.insertAll(it)
            }
            searchViewModel.isFirstOpen = false
//            delay(3000)
            searchViewModel.isQuerying = false
        }
    }

    fun showLoading(){
        lifecycleScope.launch {
            withBinding { cvLoading.setVisibility(true)}
            delay(2000)
            withBinding { cvLoading.setVisibility(false)}
        }
    }

    fun observeDatas(){
        observeEvent(searchViewModel.searchPeopleLiveData){
            when(it){
                is ResourceState.Success -> {
                    updateList(it.body)
                }
                is ResourceState.Failure -> {
                    if(searchViewModel.currentPage > 1)
                        searchViewModel.currentPage = searchViewModel.currentPage -1
                    if(adapter.listItems.isEmpty()){
                        searchViewModel.fetchOfflineCachePeopleList()
                        searchViewModel.currentPage = 1
                    }
                    searchViewModel.isQuerying = false
                    showSnackBar(viewBinding.root, it.exception.message.toString())
                }
            }
        }

        observeEvent(searchViewModel.offlineCachingLiveData){
            when(it){
                is ResourceState.Success -> updateList(it.body)
                is ResourceState.Failure -> {
                    searchViewModel.isQuerying = false
                    showSnackBar(viewBinding.root, "Caching Load Error")
                }
            }
        }

        observeEvent(searchViewModel.updateOfflinePeopleLiveData){
            when(it){
                is ResourceState.Success -> { }
                is ResourceState.Failure -> showSnackBar(viewBinding.root, "Caching Load Error")
            }
        }
    }
}

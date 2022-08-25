package com.example.testapplication.domain.usecases

import com.example.testapplication.base_component.base_classes.BaseUseCase
import com.example.testapplication.data.remote_repository.SwapiApiInterface
import kotlinx.coroutines.launch
import com.example.testapplication.domain.models.request.SearchPeopleRequest
import com.example.testapplication.domain.models.response.SearchPeopleResponse

class SearchPeopleUseCase(
    val api : SwapiApiInterface
) : BaseUseCase<SearchPeopleRequest, SearchPeopleResponse>(){

    override fun setup(parameter: SearchPeopleRequest) {
        super.setup(parameter)
        launch(coroutineContext) {
            execute {
                var data : SearchPeopleResponse? = null
                api.searchPeopleList(parameter).let{
                    data = it
                    return@execute data
                }
            }
        }
    }
}
package com.example.testapplication.feature;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u00105\u001a\u000206J\u0006\u00107\u001a\u000206J\u000e\u00108\u001a\u0002062\u0006\u00109\u001a\u00020:J\u0014\u0010;\u001a\u0002062\f\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001a\u0010\"\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010Re\u0010%\u001aV\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0( **\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(\u0018\u00010\'0\' ***\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0( **\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(\u0018\u00010\'0\'\u0018\u00010&0&\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,Re\u0010-\u001aV\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0( **\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(\u0018\u00010\'0\' ***\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0( **\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(\u0018\u00010\'0\'\u0018\u00010&0&\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R#\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0(0\'0&\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010,\u00a8\u0006?"}, d2 = {"Lcom/example/testapplication/feature/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "fetchPeopleUseCase", "Lcom/example/testapplication/domain/usecases/FetchPeopleUseCase;", "searchPeopleUseCase", "Lcom/example/testapplication/domain/usecases/SearchPeopleUseCase;", "fetchOfflinePeopleListUseCase", "Lcom/example/testapplication/domain/usecases/FetchOfflinePeopleListUseCase;", "updateOfflinePeopleListUseCase", "Lcom/example/testapplication/domain/usecases/UpdateOfflinePeopleListUseCase;", "(Lcom/example/testapplication/domain/usecases/FetchPeopleUseCase;Lcom/example/testapplication/domain/usecases/SearchPeopleUseCase;Lcom/example/testapplication/domain/usecases/FetchOfflinePeopleListUseCase;Lcom/example/testapplication/domain/usecases/UpdateOfflinePeopleListUseCase;)V", "currentPage", "", "getCurrentPage", "()I", "setCurrentPage", "(I)V", "currentQuerySearch", "", "getCurrentQuerySearch", "()Ljava/lang/String;", "setCurrentQuerySearch", "(Ljava/lang/String;)V", "getFetchOfflinePeopleListUseCase", "()Lcom/example/testapplication/domain/usecases/FetchOfflinePeopleListUseCase;", "getFetchPeopleUseCase", "()Lcom/example/testapplication/domain/usecases/FetchPeopleUseCase;", "isFirstOpen", "", "()Z", "setFirstOpen", "(Z)V", "isQuerying", "setQuerying", "maxCount", "getMaxCount", "setMaxCount", "offlineCachingLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/example/testapplication/base_component/entities/Event;", "Lcom/example/testapplication/base_component/entities/ResourceState;", "Lcom/example/testapplication/feature/model/PeopleListModel;", "kotlin.jvm.PlatformType", "getOfflineCachingLiveData", "()Landroidx/lifecycle/LiveData;", "searchPeopleLiveData", "getSearchPeopleLiveData", "getSearchPeopleUseCase", "()Lcom/example/testapplication/domain/usecases/SearchPeopleUseCase;", "getUpdateOfflinePeopleListUseCase", "()Lcom/example/testapplication/domain/usecases/UpdateOfflinePeopleListUseCase;", "updateOfflinePeopleLiveData", "getUpdateOfflinePeopleLiveData", "fetchOfflineCachePeopleList", "", "onDestroy", "searchPeopleData", "param", "Lcom/example/testapplication/domain/models/request/SearchPeopleRequest;", "updateOfflineCachingPeople", "content", "", "Lcom/example/testapplication/domain/models/response/PeopleItemResponse;", "app_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.testapplication.domain.usecases.FetchPeopleUseCase fetchPeopleUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.testapplication.domain.usecases.SearchPeopleUseCase searchPeopleUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.testapplication.domain.usecases.FetchOfflinePeopleListUseCase fetchOfflinePeopleListUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.testapplication.domain.usecases.UpdateOfflinePeopleListUseCase updateOfflinePeopleListUseCase = null;
    private boolean isFirstOpen = true;
    private boolean isQuerying = false;
    private int maxCount = 0;
    private int currentPage = 1;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentQuerySearch = "";
    private final androidx.lifecycle.LiveData<com.example.testapplication.base_component.entities.Event<com.example.testapplication.base_component.entities.ResourceState<com.example.testapplication.feature.model.PeopleListModel>>> searchPeopleLiveData = null;
    private final androidx.lifecycle.LiveData<com.example.testapplication.base_component.entities.Event<com.example.testapplication.base_component.entities.ResourceState<com.example.testapplication.feature.model.PeopleListModel>>> offlineCachingLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.testapplication.base_component.entities.Event<com.example.testapplication.base_component.entities.ResourceState<java.lang.Boolean>>> updateOfflinePeopleLiveData = null;
    
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    com.example.testapplication.domain.usecases.FetchPeopleUseCase fetchPeopleUseCase, @org.jetbrains.annotations.NotNull()
    com.example.testapplication.domain.usecases.SearchPeopleUseCase searchPeopleUseCase, @org.jetbrains.annotations.NotNull()
    com.example.testapplication.domain.usecases.FetchOfflinePeopleListUseCase fetchOfflinePeopleListUseCase, @org.jetbrains.annotations.NotNull()
    com.example.testapplication.domain.usecases.UpdateOfflinePeopleListUseCase updateOfflinePeopleListUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testapplication.domain.usecases.FetchPeopleUseCase getFetchPeopleUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testapplication.domain.usecases.SearchPeopleUseCase getSearchPeopleUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testapplication.domain.usecases.FetchOfflinePeopleListUseCase getFetchOfflinePeopleListUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testapplication.domain.usecases.UpdateOfflinePeopleListUseCase getUpdateOfflinePeopleListUseCase() {
        return null;
    }
    
    public final boolean isFirstOpen() {
        return false;
    }
    
    public final void setFirstOpen(boolean p0) {
    }
    
    public final boolean isQuerying() {
        return false;
    }
    
    public final void setQuerying(boolean p0) {
    }
    
    public final int getMaxCount() {
        return 0;
    }
    
    public final void setMaxCount(int p0) {
    }
    
    public final int getCurrentPage() {
        return 0;
    }
    
    public final void setCurrentPage(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentQuerySearch() {
        return null;
    }
    
    public final void setCurrentQuerySearch(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final androidx.lifecycle.LiveData<com.example.testapplication.base_component.entities.Event<com.example.testapplication.base_component.entities.ResourceState<com.example.testapplication.feature.model.PeopleListModel>>> getSearchPeopleLiveData() {
        return null;
    }
    
    public final void searchPeopleData(@org.jetbrains.annotations.NotNull()
    com.example.testapplication.domain.models.request.SearchPeopleRequest param) {
    }
    
    public final androidx.lifecycle.LiveData<com.example.testapplication.base_component.entities.Event<com.example.testapplication.base_component.entities.ResourceState<com.example.testapplication.feature.model.PeopleListModel>>> getOfflineCachingLiveData() {
        return null;
    }
    
    public final void fetchOfflineCachePeopleList() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.testapplication.base_component.entities.Event<com.example.testapplication.base_component.entities.ResourceState<java.lang.Boolean>>> getUpdateOfflinePeopleLiveData() {
        return null;
    }
    
    public final void updateOfflineCachingPeople(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.testapplication.domain.models.response.PeopleItemResponse> content) {
    }
    
    public final void onDestroy() {
    }
}
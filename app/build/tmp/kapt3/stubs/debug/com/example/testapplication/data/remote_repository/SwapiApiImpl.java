package com.example.testapplication.data.remote_repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J!\u0010\u0018\u001a\u00020\u00192\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/example/testapplication/data/remote_repository/SwapiApiImpl;", "Lcom/example/testapplication/data/remote_repository/SwapiApiInterface;", "swapiRetrofitInterface", "Lcom/example/testapplication/data/remote_repository/SwapiRetrofitInterface;", "dao", "Lcom/example/testapplication/data/local_db/PeopleItemDao;", "(Lcom/example/testapplication/data/remote_repository/SwapiRetrofitInterface;Lcom/example/testapplication/data/local_db/PeopleItemDao;)V", "getDao", "()Lcom/example/testapplication/data/local_db/PeopleItemDao;", "getSwapiRetrofitInterface", "()Lcom/example/testapplication/data/remote_repository/SwapiRetrofitInterface;", "getOfflinePeopleList", "", "Lcom/example/testapplication/domain/models/response/PeopleItemResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPeopleList", "Lcom/example/testapplication/domain/models/response/SearchPeopleResponse;", "queryPeopleRequest", "Lcom/example/testapplication/domain/models/request/QueryPeopleRequest;", "(Lcom/example/testapplication/domain/models/request/QueryPeopleRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchPeopleList", "searchPeopleRequest", "Lcom/example/testapplication/domain/models/request/SearchPeopleRequest;", "(Lcom/example/testapplication/domain/models/request/SearchPeopleRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setOfflineCachePeopleList", "", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class SwapiApiImpl implements com.example.testapplication.data.remote_repository.SwapiApiInterface {
    @org.jetbrains.annotations.NotNull()
    private final com.example.testapplication.data.remote_repository.SwapiRetrofitInterface swapiRetrofitInterface = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.testapplication.data.local_db.PeopleItemDao dao = null;
    
    public SwapiApiImpl(@org.jetbrains.annotations.NotNull()
    com.example.testapplication.data.remote_repository.SwapiRetrofitInterface swapiRetrofitInterface, @org.jetbrains.annotations.NotNull()
    com.example.testapplication.data.local_db.PeopleItemDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testapplication.data.remote_repository.SwapiRetrofitInterface getSwapiRetrofitInterface() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testapplication.data.local_db.PeopleItemDao getDao() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPeopleList(@org.jetbrains.annotations.NotNull()
    com.example.testapplication.domain.models.request.QueryPeopleRequest queryPeopleRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.testapplication.domain.models.response.SearchPeopleResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchPeopleList(@org.jetbrains.annotations.NotNull()
    com.example.testapplication.domain.models.request.SearchPeopleRequest searchPeopleRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.testapplication.domain.models.response.SearchPeopleResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getOfflinePeopleList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.testapplication.domain.models.response.PeopleItemResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object setOfflineCachePeopleList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.testapplication.domain.models.response.PeopleItemResponse> list, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
}
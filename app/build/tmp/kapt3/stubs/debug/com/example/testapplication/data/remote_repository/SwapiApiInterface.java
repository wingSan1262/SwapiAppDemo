package com.example.testapplication.data.remote_repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/testapplication/data/remote_repository/SwapiApiInterface;", "", "getOfflinePeopleList", "", "Lvanrrtech/app/ajaib_app_sample/domain/data_model/github/response/PeopleItemResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPeopleList", "Lvanrrtech/app/ajaib_app_sample/domain/data_model/github/response/SearchPeopleResponse;", "queryPeopleRequest", "Lvanrrtech/app/ajaib_app_sample/domain/data_model/github/request/QueryPeopleRequest;", "(Lvanrrtech/app/ajaib_app_sample/domain/data_model/github/request/QueryPeopleRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchPeopleList", "searchPeopleRequest", "Lvanrrtech/app/ajaib_app_sample/domain/data_model/github/request/SearchPeopleRequest;", "(Lvanrrtech/app/ajaib_app_sample/domain/data_model/github/request/SearchPeopleRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setOfflineCachePeopleList", "", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface SwapiApiInterface {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPeopleList(@org.jetbrains.annotations.NotNull()
    vanrrtech.app.ajaib_app_sample.domain.data_model.github.request.QueryPeopleRequest queryPeopleRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super vanrrtech.app.ajaib_app_sample.domain.data_model.github.response.SearchPeopleResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchPeopleList(@org.jetbrains.annotations.NotNull()
    vanrrtech.app.ajaib_app_sample.domain.data_model.github.request.SearchPeopleRequest searchPeopleRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super vanrrtech.app.ajaib_app_sample.domain.data_model.github.response.SearchPeopleResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getOfflinePeopleList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<vanrrtech.app.ajaib_app_sample.domain.data_model.github.response.PeopleItemResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setOfflineCachePeopleList(@org.jetbrains.annotations.Nullable()
    java.util.List<vanrrtech.app.ajaib_app_sample.domain.data_model.github.response.PeopleItemResponse> list, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
}
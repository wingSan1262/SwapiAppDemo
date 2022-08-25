package vanrrtech.app.ajaib_app_sample.data.remote_repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lvanrrtech/app/ajaib_app_sample/data/remote_repository/SwapiRetrofitInterface;", "", "getPeopleList", "Lvanrrtech/app/ajaib_app_sample/domain/data_model/github/response/SearchPeopleResponse;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchPeople", "searchKey", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface SwapiRetrofitInterface {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "people")
    public abstract java.lang.Object getPeopleList(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super vanrrtech.app.ajaib_app_sample.domain.data_model.github.response.SearchPeopleResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "people")
    public abstract java.lang.Object searchPeople(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "search")
    java.lang.String searchKey, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super vanrrtech.app.ajaib_app_sample.domain.data_model.github.response.SearchPeopleResponse> continuation);
}
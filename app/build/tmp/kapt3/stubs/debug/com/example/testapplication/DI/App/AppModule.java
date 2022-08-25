package com.example.testapplication.DI.App;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0002\u001a\u00020\u0003H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0007J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000eH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0003H\u0007J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0017H\u0007J\b\u0010\u001a\u001a\u00020\u001bH\u0007J0\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\'"}, d2 = {"Lcom/example/testapplication/DI/App/AppModule;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "getClient", "Lvanrrtech/app/ajaib_app_sample/data/remote_repository/RemoteApiRetrofitClient;", "retrofit", "Lretrofit2/Retrofit;", "getClientLogger", "Lokhttp3/logging/HttpLoggingInterceptor;", "getOkHttpClientBuilder", "Lokhttp3/OkHttpClient$Builder;", "logger", "getRetrofitClient", "okHttpBuilder", "getSwapiApi", "Lcom/example/testapplication/data/remote_repository/SwapiApiInterface;", "peopleItemDao", "Lvanrrtech/app/ajaib_app_sample/data/SQDb/github/PeopleItemDao;", "getUserListDataDB", "Lvanrrtech/app/ajaib_app_sample/data/SQDb/github/LocalDb;", "getUserListDataDBDao", "db", "getViewBinderFactory", "Lcom/example/testapplication/DI/Activity/ViewBinderFactory/ViewBinderFactory;", "getVmFactory", "Lcom/example/testapplication/DI/Activity/ViewModelProducer/VmFactory;", "mApplication", "fetchPeopleUseCase", "Lcom/example/testapplication/domain/usecases/FetchPeopleUseCase;", "searchPeopleUseCase", "Lcom/example/testapplication/domain/usecases/SearchPeopleUseCase;", "fetchOfflinePeopleListUseCase", "Lcom/example/testapplication/domain/usecases/FetchOfflinePeopleListUseCase;", "updateOfflinePeopleListUseCase", "Lcom/example/testapplication/domain/usecases/UpdateOfflinePeopleListUseCase;", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application application = null;
    
    public AppModule(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @AppScope()
    @dagger.Provides()
    public final okhttp3.logging.HttpLoggingInterceptor getClientLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @AppScope()
    @dagger.Provides()
    public final okhttp3.OkHttpClient.Builder getOkHttpClientBuilder(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor logger) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @AppScope()
    @dagger.Provides()
    public final retrofit2.Retrofit getRetrofitClient(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient.Builder okHttpBuilder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @AppScope()
    @dagger.Provides()
    public final vanrrtech.app.ajaib_app_sample.data.remote_repository.RemoteApiRetrofitClient getClient(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @AppScope()
    @dagger.Provides()
    public final com.example.testapplication.data.remote_repository.SwapiApiInterface getSwapiApi(@org.jetbrains.annotations.NotNull()
    vanrrtech.app.ajaib_app_sample.data.remote_repository.RemoteApiRetrofitClient retrofit, @org.jetbrains.annotations.NotNull()
    vanrrtech.app.ajaib_app_sample.data.SQDb.github.PeopleItemDao peopleItemDao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @AppScope()
    @dagger.Provides()
    public final vanrrtech.app.ajaib_app_sample.data.SQDb.github.LocalDb getUserListDataDB(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @AppScope()
    @dagger.Provides()
    public final vanrrtech.app.ajaib_app_sample.data.SQDb.github.PeopleItemDao getUserListDataDBDao(@org.jetbrains.annotations.NotNull()
    vanrrtech.app.ajaib_app_sample.data.SQDb.github.LocalDb db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.app.Application application() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @AppScope()
    @dagger.Provides()
    public final com.example.testapplication.DI.Activity.ViewModelProducer.VmFactory getVmFactory(@org.jetbrains.annotations.NotNull()
    android.app.Application mApplication, @org.jetbrains.annotations.NotNull()
    com.example.testapplication.domain.usecases.FetchPeopleUseCase fetchPeopleUseCase, @org.jetbrains.annotations.NotNull()
    com.example.testapplication.domain.usecases.SearchPeopleUseCase searchPeopleUseCase, @org.jetbrains.annotations.NotNull()
    com.example.testapplication.domain.usecases.FetchOfflinePeopleListUseCase fetchOfflinePeopleListUseCase, @org.jetbrains.annotations.NotNull()
    com.example.testapplication.domain.usecases.UpdateOfflinePeopleListUseCase updateOfflinePeopleListUseCase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @AppScope()
    @dagger.Provides()
    public final com.example.testapplication.DI.Activity.ViewBinderFactory.ViewBinderFactory getViewBinderFactory() {
        return null;
    }
}
package com.example.testapplication.DI.App;

import java.lang.System;

/**
 * UseCase Module
 * Which AppScoped
 *
 * i think usecase is better to be available on all app or module
 * if you have better idea please modify
 *
 * @see AppComponent
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\r"}, d2 = {"Lcom/example/testapplication/DI/App/UseCasesModules;", "", "()V", "getCachePeopleList", "Lcom/example/testapplication/domain/usecases/FetchOfflinePeopleListUseCase;", "myApi", "Lcom/example/testapplication/data/remote_repository/SwapiApiInterface;", "getPeopleList", "Lcom/example/testapplication/domain/usecases/FetchPeopleUseCase;", "searchPeopleList", "Lcom/example/testapplication/domain/usecases/SearchPeopleUseCase;", "updateCachePeopleList", "Lcom/example/testapplication/domain/usecases/UpdateOfflinePeopleListUseCase;", "app_debug"})
@dagger.Module()
public final class UseCasesModules {
    
    public UseCasesModules() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @AppScope()
    @dagger.Provides()
    public final com.example.testapplication.domain.usecases.FetchPeopleUseCase getPeopleList(@org.jetbrains.annotations.NotNull()
    com.example.testapplication.data.remote_repository.SwapiApiInterface myApi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @AppScope()
    @dagger.Provides()
    public final com.example.testapplication.domain.usecases.SearchPeopleUseCase searchPeopleList(@org.jetbrains.annotations.NotNull()
    com.example.testapplication.data.remote_repository.SwapiApiInterface myApi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @AppScope()
    @dagger.Provides()
    public final com.example.testapplication.domain.usecases.UpdateOfflinePeopleListUseCase updateCachePeopleList(@org.jetbrains.annotations.NotNull()
    com.example.testapplication.data.remote_repository.SwapiApiInterface myApi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @AppScope()
    @dagger.Provides()
    public final com.example.testapplication.domain.usecases.FetchOfflinePeopleListUseCase getCachePeopleList(@org.jetbrains.annotations.NotNull()
    com.example.testapplication.data.remote_repository.SwapiApiInterface myApi) {
        return null;
    }
}
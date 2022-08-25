package com.example.testapplication.DI.Activity.ViewModelProducer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ%\u0010\u0017\u001a\u0002H\u0018\"\b\b\u0000\u0010\u0018*\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001bH\u0016\u00a2\u0006\u0002\u0010\u001cJ%\u0010\u001d\u001a\u0002H\u0018\"\n\b\u0000\u0010\u0018*\u0004\u0018\u00010\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001b\u00a2\u0006\u0002\u0010\u001cR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001e"}, d2 = {"Lcom/example/testapplication/DI/Activity/ViewModelProducer/VmFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "mApplication", "Landroid/app/Application;", "fetchPeopleUseCase", "Lcom/example/testapplication/domain/usecases/FetchPeopleUseCase;", "searchPeopleUseCase", "Lcom/example/testapplication/domain/usecases/SearchPeopleUseCase;", "fetchOfflinePeopleListUseCase", "Lcom/example/testapplication/domain/usecases/FetchOfflinePeopleListUseCase;", "updateOfflinePeopleListUseCase", "Lcom/example/testapplication/domain/usecases/UpdateOfflinePeopleListUseCase;", "(Landroid/app/Application;Lcom/example/testapplication/domain/usecases/FetchPeopleUseCase;Lcom/example/testapplication/domain/usecases/SearchPeopleUseCase;Lcom/example/testapplication/domain/usecases/FetchOfflinePeopleListUseCase;Lcom/example/testapplication/domain/usecases/UpdateOfflinePeopleListUseCase;)V", "getFetchOfflinePeopleListUseCase", "()Lcom/example/testapplication/domain/usecases/FetchOfflinePeopleListUseCase;", "getFetchPeopleUseCase", "()Lcom/example/testapplication/domain/usecases/FetchPeopleUseCase;", "getMApplication", "()Landroid/app/Application;", "getSearchPeopleUseCase", "()Lcom/example/testapplication/domain/usecases/SearchPeopleUseCase;", "getUpdateOfflinePeopleListUseCase", "()Lcom/example/testapplication/domain/usecases/UpdateOfflinePeopleListUseCase;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "getClassInstance", "app_debug"})
public final class VmFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application mApplication = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.testapplication.domain.usecases.FetchPeopleUseCase fetchPeopleUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.testapplication.domain.usecases.SearchPeopleUseCase searchPeopleUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.testapplication.domain.usecases.FetchOfflinePeopleListUseCase fetchOfflinePeopleListUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.testapplication.domain.usecases.UpdateOfflinePeopleListUseCase updateOfflinePeopleListUseCase = null;
    
    public VmFactory(@org.jetbrains.annotations.NotNull()
    android.app.Application mApplication, @org.jetbrains.annotations.NotNull()
    com.example.testapplication.domain.usecases.FetchPeopleUseCase fetchPeopleUseCase, @org.jetbrains.annotations.NotNull()
    com.example.testapplication.domain.usecases.SearchPeopleUseCase searchPeopleUseCase, @org.jetbrains.annotations.NotNull()
    com.example.testapplication.domain.usecases.FetchOfflinePeopleListUseCase fetchOfflinePeopleListUseCase, @org.jetbrains.annotations.NotNull()
    com.example.testapplication.domain.usecases.UpdateOfflinePeopleListUseCase updateOfflinePeopleListUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getMApplication() {
        return null;
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
    
    public final <T extends androidx.lifecycle.ViewModel>T getClassInstance(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
}
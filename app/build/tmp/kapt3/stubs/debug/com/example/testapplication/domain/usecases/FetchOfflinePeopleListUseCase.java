package com.example.testapplication.domain.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\r"}, d2 = {"Lcom/example/testapplication/domain/usecases/FetchOfflinePeopleListUseCase;", "Lcom/example/testapplication/base_component/base_classes/BaseUseCase;", "", "", "Lcom/example/testapplication/domain/models/response/PeopleItemResponse;", "myApi", "Lcom/example/testapplication/data/remote_repository/SwapiApiInterface;", "(Lcom/example/testapplication/data/remote_repository/SwapiApiInterface;)V", "getMyApi", "()Lcom/example/testapplication/data/remote_repository/SwapiApiInterface;", "setup", "", "parameter", "app_debug"})
public final class FetchOfflinePeopleListUseCase extends com.example.testapplication.base_component.base_classes.BaseUseCase<java.lang.Object, java.util.List<? extends com.example.testapplication.domain.models.response.PeopleItemResponse>> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.testapplication.data.remote_repository.SwapiApiInterface myApi = null;
    
    public FetchOfflinePeopleListUseCase(@org.jetbrains.annotations.NotNull()
    com.example.testapplication.data.remote_repository.SwapiApiInterface myApi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testapplication.data.remote_repository.SwapiApiInterface getMyApi() {
        return null;
    }
    
    @java.lang.Override()
    public void setup(@org.jetbrains.annotations.Nullable()
    java.lang.Object parameter) {
    }
}
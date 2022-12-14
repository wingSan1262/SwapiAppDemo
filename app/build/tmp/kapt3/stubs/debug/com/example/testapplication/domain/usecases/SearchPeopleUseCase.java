package com.example.testapplication.domain.usecases;

import java.lang.System;

/**
 * API usecase wrapper
 * please subscribe to this livedata usecase
 *
 * @see BaseUseCase
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/example/testapplication/domain/usecases/SearchPeopleUseCase;", "Lcom/example/testapplication/base_component/base_classes/BaseUseCase;", "Lcom/example/testapplication/domain/models/request/SearchPeopleRequest;", "Lcom/example/testapplication/domain/models/response/SearchPeopleResponse;", "api", "Lcom/example/testapplication/data/remote_repository/SwapiApiInterface;", "(Lcom/example/testapplication/data/remote_repository/SwapiApiInterface;)V", "getApi", "()Lcom/example/testapplication/data/remote_repository/SwapiApiInterface;", "setup", "", "parameter", "app_debug"})
public final class SearchPeopleUseCase extends com.example.testapplication.base_component.base_classes.BaseUseCase<com.example.testapplication.domain.models.request.SearchPeopleRequest, com.example.testapplication.domain.models.response.SearchPeopleResponse> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.testapplication.data.remote_repository.SwapiApiInterface api = null;
    
    public SearchPeopleUseCase(@org.jetbrains.annotations.NotNull()
    com.example.testapplication.data.remote_repository.SwapiApiInterface api) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testapplication.data.remote_repository.SwapiApiInterface getApi() {
        return null;
    }
    
    @java.lang.Override()
    public void setup(@org.jetbrains.annotations.NotNull()
    com.example.testapplication.domain.models.request.SearchPeopleRequest parameter) {
    }
}
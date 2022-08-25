package com.example.testapplication.domain.models.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0004H\u00c6\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0003J%\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, d2 = {"Lcom/example/testapplication/domain/models/response/SearchPeopleResponse;", "Ljava/io/Serializable;", "Lcom/example/testapplication/base_component/base_interface/BaseModel;", "count", "", "results", "", "Lcom/example/testapplication/domain/models/response/PeopleItemResponse;", "(ILjava/util/List;)V", "getCount", "()I", "setCount", "(I)V", "getResults", "()Ljava/util/List;", "setResults", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
public final class SearchPeopleResponse implements java.io.Serializable, com.example.testapplication.base_component.base_interface.BaseModel {
    @com.google.gson.annotations.SerializedName(value = "count")
    private int count;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "results")
    private java.util.List<com.example.testapplication.domain.models.response.PeopleItemResponse> results;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testapplication.domain.models.response.SearchPeopleResponse copy(int count, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.testapplication.domain.models.response.PeopleItemResponse> results) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public SearchPeopleResponse() {
        super();
    }
    
    public SearchPeopleResponse(int count, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.testapplication.domain.models.response.PeopleItemResponse> results) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getCount() {
        return 0;
    }
    
    public final void setCount(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.testapplication.domain.models.response.PeopleItemResponse> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.testapplication.domain.models.response.PeopleItemResponse> getResults() {
        return null;
    }
    
    public final void setResults(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.testapplication.domain.models.response.PeopleItemResponse> p0) {
    }
}
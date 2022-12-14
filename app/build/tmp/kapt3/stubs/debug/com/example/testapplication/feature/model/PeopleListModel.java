package com.example.testapplication.feature.model;

import java.lang.System;

/**
 * relevant local feature data parser
 * in order for the data to be specifically relevant to feature
 * new parser for feture relevant data was added here
 * may be in feature you'll need to use dynamic feature modular
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B!\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003J%\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"Lcom/example/testapplication/feature/model/PeopleListModel;", "Ljava/io/Serializable;", "Lcom/example/testapplication/base_component/base_interface/BaseModel;", "resp", "Lcom/example/testapplication/domain/models/response/SearchPeopleResponse;", "(Lcom/example/testapplication/domain/models/response/SearchPeopleResponse;)V", "count", "", "results", "", "Lcom/example/testapplication/feature/model/PeopleItemModel;", "(ILjava/util/List;)V", "getCount", "()I", "setCount", "(I)V", "getResults", "()Ljava/util/List;", "setResults", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
public final class PeopleListModel implements java.io.Serializable, com.example.testapplication.base_component.base_interface.BaseModel {
    private int count;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.example.testapplication.feature.model.PeopleItemModel> results;
    
    /**
     * relevant local feature data parser
     * in order for the data to be specifically relevant to feature
     * new parser for feture relevant data was added here
     * may be in feature you'll need to use dynamic feature modular
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.testapplication.feature.model.PeopleListModel copy(int count, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.testapplication.feature.model.PeopleItemModel> results) {
        return null;
    }
    
    /**
     * relevant local feature data parser
     * in order for the data to be specifically relevant to feature
     * new parser for feture relevant data was added here
     * may be in feature you'll need to use dynamic feature modular
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * relevant local feature data parser
     * in order for the data to be specifically relevant to feature
     * new parser for feture relevant data was added here
     * may be in feature you'll need to use dynamic feature modular
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * relevant local feature data parser
     * in order for the data to be specifically relevant to feature
     * new parser for feture relevant data was added here
     * may be in feature you'll need to use dynamic feature modular
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public PeopleListModel() {
        super();
    }
    
    public PeopleListModel(int count, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.testapplication.feature.model.PeopleItemModel> results) {
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
    public final java.util.List<com.example.testapplication.feature.model.PeopleItemModel> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.testapplication.feature.model.PeopleItemModel> getResults() {
        return null;
    }
    
    public final void setResults(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.testapplication.feature.model.PeopleItemModel> p0) {
    }
    
    public PeopleListModel(@org.jetbrains.annotations.NotNull()
    com.example.testapplication.domain.models.response.SearchPeopleResponse resp) {
        super();
    }
}
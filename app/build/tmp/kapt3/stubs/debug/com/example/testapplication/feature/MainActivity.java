package com.example.testapplication.feature;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0011H\u0014J\u0006\u0010\u0017\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/example/testapplication/feature/MainActivity;", "Lcom/example/testapplication/base_component/base_classes/BaseActivity;", "Lcom/example/testapplication/databinding/ActivityMainBinding;", "()V", "adapter", "Lcom/example/testapplication/feature/SearchListAdapter;", "getAdapter", "()Lcom/example/testapplication/feature/SearchListAdapter;", "setAdapter", "(Lcom/example/testapplication/feature/SearchListAdapter;)V", "searchViewModel", "Lcom/example/testapplication/feature/SearchViewModel;", "getSearchViewModel", "()Lcom/example/testapplication/feature/SearchViewModel;", "setSearchViewModel", "(Lcom/example/testapplication/feature/SearchViewModel;)V", "initUi", "", "observeDatas", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "showLoading", "updateList", "data", "Lcom/example/testapplication/feature/model/PeopleListModel;", "app_debug"})
public final class MainActivity extends com.example.testapplication.base_component.base_classes.BaseActivity<com.example.testapplication.databinding.ActivityMainBinding> {
    @javax.inject.Inject()
    public com.example.testapplication.feature.SearchViewModel searchViewModel;
    @org.jetbrains.annotations.NotNull()
    private com.example.testapplication.feature.SearchListAdapter adapter;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testapplication.feature.SearchViewModel getSearchViewModel() {
        return null;
    }
    
    public final void setSearchViewModel(@org.jetbrains.annotations.NotNull()
    com.example.testapplication.feature.SearchViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testapplication.feature.SearchListAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.example.testapplication.feature.SearchListAdapter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public final void initUi() {
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    com.example.testapplication.feature.model.PeopleListModel data) {
    }
    
    /**
     * show loading and automatically dismiss it
     */
    public final void showLoading() {
    }
    
    public final void observeDatas() {
    }
}
package com.example.testapplication.base_component.base_classes;

import java.lang.System;

/**
 * Standard BaseAdapter Handling BaseModel List and  BaseViewHolder
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u001d\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0010H&\u00a2\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\rJ\b\u0010\u0013\u001a\u00020\u0010H\u0016J\u0014\u0010\u0014\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016J\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0003J\u001d\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0010H\u0016\u00a2\u0006\u0002\u0010\u0011J\u000e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u001a"}, d2 = {"Lcom/example/testapplication/base_component/base_classes/BaseAdapter;", "T", "Lcom/example/testapplication/base_component/base_classes/BaseViewHolder;", "Lcom/example/testapplication/base_component/base_interface/BaseModel;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "()V", "listItems", "", "getListItems", "()Ljava/util/List;", "setListItems", "(Ljava/util/List;)V", "bindVH", "", "holder", "position", "", "(Lcom/example/testapplication/base_component/base_classes/BaseViewHolder;I)V", "clearList", "getItemCount", "insertAll", "item", "", "insertAtTop", "onBindViewHolder", "removeItem", "app_debug"})
public abstract class BaseAdapter<T extends com.example.testapplication.base_component.base_classes.BaseViewHolder<? super com.example.testapplication.base_component.base_interface.BaseModel>> extends androidx.recyclerview.widget.RecyclerView.Adapter<T> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.testapplication.base_component.base_interface.BaseModel> listItems;
    
    public BaseAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.example.testapplication.base_component.base_interface.BaseModel> getListItems() {
        return null;
    }
    
    public void setListItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.testapplication.base_component.base_interface.BaseModel> p0) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void removeItem(@org.jetbrains.annotations.NotNull()
    com.example.testapplication.base_component.base_interface.BaseModel item) {
    }
    
    public final void clearList() {
    }
    
    public final void insertAtTop(@org.jetbrains.annotations.NotNull()
    com.example.testapplication.base_component.base_interface.BaseModel item) {
    }
    
    public final void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.example.testapplication.base_component.base_interface.BaseModel> item) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    T holder, int position) {
    }
    
    public abstract void bindVH(@org.jetbrains.annotations.NotNull()
    T holder, int position);
}
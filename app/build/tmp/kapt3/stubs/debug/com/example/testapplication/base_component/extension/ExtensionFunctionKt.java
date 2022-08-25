package com.example.testapplication.base_component.extension;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u001a8\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\n0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u00010\f\u001a\u0012\u0010\r\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010\u0011\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u001a\u0010\u0012\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015\u001a\u0012\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017*\u00020\u0019\u00a8\u0006\u001a"}, d2 = {"addOnBottomScrollListener", "", "Landroidx/recyclerview/widget/RecyclerView;", "onBottomReached", "Lkotlin/Function0;", "observeEvent", "K", "Landroidx/appcompat/app/AppCompatActivity;", "data", "Landroidx/lifecycle/LiveData;", "Lcom/example/testapplication/base_component/entities/Event;", "callback", "Lkotlin/Function1;", "setVisibility", "Landroid/view/View;", "boolean", "", "setVisibilityInvisible", "showSnackBar", "view", "msg", "", "textChanges", "Lkotlinx/coroutines/flow/Flow;", "", "Landroid/widget/EditText;", "app_debug"})
public final class ExtensionFunctionKt {
    
    /**
     * Extension method to help on observing the event object
     * to reduce unwanted boiler on view file end
     */
    public static final <K extends java.lang.Object>void observeEvent(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$observeEvent, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.example.testapplication.base_component.entities.Event<K>> data, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super K, kotlin.Unit> callback) {
    }
    
    /**
     * converting edit text changed into Coroutine Flow Streams
     */
    @org.jetbrains.annotations.NotNull()
    public static final kotlinx.coroutines.flow.Flow<java.lang.CharSequence> textChanges(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$textChanges) {
        return null;
    }
    
    /**
     * Extension method to add a bottom listener of recycler view
     * to reduce unwanted boiler on view file end
     */
    public static final void addOnBottomScrollListener(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$addOnBottomScrollListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBottomReached) {
    }
    
    /**
     * Extension method to show snack bar in activity scope
     */
    public static final void showSnackBar(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$showSnackBar, @org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    /**
     * helper for hiding UI component programatically
     */
    public static final void setVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setVisibility, boolean p1_32355860) {
    }
    
    public static final void setVisibilityInvisible(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setVisibilityInvisible, boolean p1_32355860) {
    }
}
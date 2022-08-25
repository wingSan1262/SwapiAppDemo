package com.example.testapplication.base_component.base_classes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J+\u0010\u001c\u001a\u00020\u001d\"\u0004\b\u0001\u0010\u001e2\u0006\u0010\u001f\u001a\u0002H\u001e2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#\u00a2\u0006\u0002\u0010$J\u0012\u0010%\u001a\u00020\u001d2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J$\u0010(\u001a\u00028\u00002\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001d0*\u00a2\u0006\u0002\b+\u00a2\u0006\u0002\u0010,R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006-"}, d2 = {"Lcom/example/testapplication/base_component/base_classes/BaseActivity;", "VB", "Landroidx/viewbinding/ViewBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "activityComponent", "Lcom/example/testapplication/DI/Activity/ActivityComponent;", "getActivityComponent", "()Lcom/example/testapplication/DI/Activity/ActivityComponent;", "activityComponent$delegate", "Lkotlin/Lazy;", "appComponent", "Lcom/example/testapplication/DI/App/AppComponent;", "getAppComponent", "()Lcom/example/testapplication/DI/App/AppComponent;", "appComponent$delegate", "viewBinderFactory", "Lcom/example/testapplication/DI/Activity/ViewBinderFactory/ViewBinderFactory;", "getViewBinderFactory", "()Lcom/example/testapplication/DI/Activity/ViewBinderFactory/ViewBinderFactory;", "setViewBinderFactory", "(Lcom/example/testapplication/DI/Activity/ViewBinderFactory/ViewBinderFactory;)V", "viewBinding", "getViewBinding", "()Landroidx/viewbinding/ViewBinding;", "setViewBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "bindThisView", "", "T", "host", "layoutInflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "(Ljava/lang/Object;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "withBinding", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)Landroidx/viewbinding/ViewBinding;", "app_debug"})
public abstract class BaseActivity<VB extends androidx.viewbinding.ViewBinding> extends androidx.appcompat.app.AppCompatActivity {
    
    /**
     * Scoping injection tools
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy appComponent$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy activityComponent$delegate = null;
    
    /**
     * Common Injection Service Component, add here if needed
     */
    @javax.inject.Inject()
    public com.example.testapplication.DI.Activity.ViewBinderFactory.ViewBinderFactory viewBinderFactory;
    
    /**
     * Common View Binding Operation
     */
    public VB viewBinding;
    
    public BaseActivity() {
        super();
    }
    
    /**
     * Scoping injection tools
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.testapplication.DI.App.AppComponent getAppComponent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testapplication.DI.Activity.ActivityComponent getActivityComponent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testapplication.DI.Activity.ViewBinderFactory.ViewBinderFactory getViewBinderFactory() {
        return null;
    }
    
    public final void setViewBinderFactory(@org.jetbrains.annotations.NotNull()
    com.example.testapplication.DI.Activity.ViewBinderFactory.ViewBinderFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final VB getViewBinding() {
        return null;
    }
    
    public final void setViewBinding(@org.jetbrains.annotations.NotNull()
    VB p0) {
    }
    
    public final <T extends java.lang.Object>void bindThisView(T host, @org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater layoutInflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final VB withBinding(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super VB, kotlin.Unit> block) {
        return null;
    }
}
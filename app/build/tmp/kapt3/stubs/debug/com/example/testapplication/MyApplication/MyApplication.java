package com.example.testapplication.MyApplication;

import java.lang.System;

/**
 * Custom Application Object Holder
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/example/testapplication/MyApplication/MyApplication;", "Landroid/app/Application;", "()V", "myAppComponent", "Lcom/example/testapplication/DI/App/AppComponent;", "getMyAppComponent", "()Lcom/example/testapplication/DI/App/AppComponent;", "myAppComponent$delegate", "Lkotlin/Lazy;", "onCreate", "", "Companion", "app_debug"})
public final class MyApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy myAppComponent$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.testapplication.MyApplication.MyApplication.Companion Companion = null;
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    private static android.content.Context context;
    
    public MyApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testapplication.DI.App.AppComponent getMyAppComponent() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/testapplication/MyApplication/MyApplication$Companion;", "", "()V", "appContext", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "context", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.content.Context getAppContext() {
            return null;
        }
    }
}
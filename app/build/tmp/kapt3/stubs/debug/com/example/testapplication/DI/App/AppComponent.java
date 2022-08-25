package com.example.testapplication.DI.App;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/testapplication/DI/App/AppComponent;", "", "newActivityComponent", "Lcom/example/testapplication/DI/Activity/ActivityComponent;", "activityModule", "Lcom/example/testapplication/DI/Activity/ActivityModule;", "app_debug"})
@dagger.Component(modules = {com.example.testapplication.DI.App.AppModule.class, com.example.testapplication.DI.App.UseCasesModules.class})
@AppScope()
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.testapplication.DI.Activity.ActivityComponent newActivityComponent(@org.jetbrains.annotations.NotNull()
    com.example.testapplication.DI.Activity.ActivityModule activityModule);
}
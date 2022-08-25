package com.example.testapplication.DI.App;

import java.lang.System;

/**
 * this DI schema is following good practice on Android Basic Scoping
 * which actually already same with Dagger Hilt (note : still use Dagger 2)
 *
 * All component that needs to stay on AppScope
 * or stay when app start until killed, unchanged
 * use AppModule and Scoped,
 *
 * if i may please avoid Singleton, due to its one of anti pattern
 * and will make testing harder . . . Appscoping can be one of its alternates
 *
 * if need for activity scoped object, please add there
 * @See ActivityComponent
 *
 * @Link https://www.youtube.com/watch?v=sZVXFgpte68
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/testapplication/DI/App/AppComponent;", "", "newActivityComponent", "Lcom/example/testapplication/DI/Activity/ActivityComponent;", "activityModule", "Lcom/example/testapplication/DI/Activity/ActivityModule;", "app_debug"})
@dagger.Component(modules = {com.example.testapplication.DI.App.AppModule.class, com.example.testapplication.DI.App.UseCasesModules.class})
@AppScope()
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.testapplication.DI.Activity.ActivityComponent newActivityComponent(@org.jetbrains.annotations.NotNull()
    com.example.testapplication.DI.Activity.ActivityModule activityModule);
}
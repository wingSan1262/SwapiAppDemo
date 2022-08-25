package com.example.testapplication.base_component.base_classes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J.\u0010\u001b\u001a\u00020\u00192\u001e\u0010\u001c\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001d\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0006\u0010!\u001a\u00020\"J\u0015\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010%R \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR#\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\b0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/example/testapplication/base_component/base_classes/BaseUseCase;", "PARAM", "RESULT", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/example/testapplication/base_component/abstracts/UseCase;", "()V", "_currentData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/testapplication/base_component/entities/Event;", "Lcom/example/testapplication/base_component/entities/ResourceState;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "currentData", "Landroidx/lifecycle/LiveData;", "getCurrentData", "()Landroidx/lifecycle/LiveData;", "job", "Lkotlinx/coroutines/CompletableJob;", "getJob", "()Lkotlinx/coroutines/CompletableJob;", "setJob", "(Lkotlinx/coroutines/CompletableJob;)V", "cancel", "", "checkJob", "execute", "runApi", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)V", "isCancelled", "", "setup", "parameter", "(Ljava/lang/Object;)V", "app_debug"})
public class BaseUseCase<PARAM extends java.lang.Object, RESULT extends java.lang.Object> extends com.example.testapplication.base_component.abstracts.UseCase implements kotlinx.coroutines.CoroutineScope {
    
    /**
     * UseCase Original Response LiveData
     */
    private final androidx.lifecycle.MutableLiveData<com.example.testapplication.base_component.entities.Event<com.example.testapplication.base_component.entities.ResourceState<RESULT>>> _currentData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.testapplication.base_component.entities.Event<com.example.testapplication.base_component.entities.ResourceState<RESULT>>> currentData = null;
    
    /**
     * Job Context Scope
     */
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.CompletableJob job;
    
    public BaseUseCase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.testapplication.base_component.entities.Event<com.example.testapplication.base_component.entities.ResourceState<RESULT>>> getCurrentData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.CompletableJob getJob() {
        return null;
    }
    
    protected final void setJob(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CompletableJob p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    /**
     * Execute UseCase api or process
     */
    public final void execute(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super RESULT>, ? extends java.lang.Object> runApi) {
    }
    
    /**
     * Open function for user class to varies the execute call
     */
    public void setup(PARAM parameter) {
    }
    
    /**
     * Common Job Control
     */
    public final void cancel() {
    }
    
    public final boolean isCancelled() {
        return false;
    }
    
    public final void checkJob() {
    }
}
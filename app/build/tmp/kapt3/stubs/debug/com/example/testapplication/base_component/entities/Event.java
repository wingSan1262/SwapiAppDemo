package com.example.testapplication.base_component.entities;

import java.lang.System;

/**
 * Event class wrapper
 * it main function is to tag a data notified by live data
 * so we can now if the data already handled by previous session or not
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00018\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/example/testapplication/base_component/entities/Event;", "T", "", "content", "(Ljava/lang/Object;)V", "contentIfNotHandled", "getContentIfNotHandled", "()Ljava/lang/Object;", "hasBeenHandled", "", "mContent", "Ljava/lang/Object;", "app_debug"})
public final class Event<T extends java.lang.Object> {
    private final T mContent = null;
    private boolean hasBeenHandled = false;
    
    public Event(@org.jetbrains.annotations.Nullable()
    T content) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getContentIfNotHandled() {
        return null;
    }
    
    public final boolean hasBeenHandled() {
        return false;
    }
}
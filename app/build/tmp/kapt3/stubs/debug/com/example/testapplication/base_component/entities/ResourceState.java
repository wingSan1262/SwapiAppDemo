package com.example.testapplication.base_component.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/testapplication/base_component/entities/ResourceState;", "T", "", "()V", "Failure", "Success", "Lcom/example/testapplication/base_component/entities/ResourceState$Success;", "Lcom/example/testapplication/base_component/entities/ResourceState$Failure;", "app_debug"})
public abstract class ResourceState<T extends java.lang.Object> {
    
    private ResourceState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00028\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0013\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/example/testapplication/base_component/entities/ResourceState$Success;", "T", "Lcom/example/testapplication/base_component/entities/ResourceState;", "body", "code", "", "(Ljava/lang/Object;I)V", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getCode", "()I", "component1", "component2", "copy", "(Ljava/lang/Object;I)Lcom/example/testapplication/base_component/entities/ResourceState$Success;", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends com.example.testapplication.base_component.entities.ResourceState<T> {
        private final T body = null;
        private final int code = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.testapplication.base_component.entities.ResourceState.Success<T> copy(T body, int code) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Success(T body, int code) {
            super();
        }
        
        public final T component1() {
            return null;
        }
        
        public final T getBody() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getCode() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00018\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\bH\u00c6\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00018\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003JH\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u0010\n\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010!\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\"\u001a\u00020\bH\u00d6\u0001R\u0015\u0010\t\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010\u00a8\u0006#"}, d2 = {"Lcom/example/testapplication/base_component/entities/ResourceState$Failure;", "T", "Lcom/example/testapplication/base_component/entities/ResourceState;", "exception", "", "code", "", "requestTag", "", "body", "statusCode", "(Ljava/lang/Throwable;ILjava/lang/String;Ljava/lang/Object;I)V", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getCode", "()I", "getException", "()Ljava/lang/Throwable;", "getRequestTag", "()Ljava/lang/String;", "getStatusCode", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Throwable;ILjava/lang/String;Ljava/lang/Object;I)Lcom/example/testapplication/base_component/entities/ResourceState$Failure;", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
    public static final class Failure<T extends java.lang.Object> extends com.example.testapplication.base_component.entities.ResourceState<T> {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Throwable exception = null;
        private final int code = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String requestTag = null;
        @org.jetbrains.annotations.Nullable()
        private final T body = null;
        private final int statusCode = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.testapplication.base_component.entities.ResourceState.Failure<T> copy(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable exception, int code, @org.jetbrains.annotations.NotNull()
        java.lang.String requestTag, @org.jetbrains.annotations.Nullable()
        T body, int statusCode) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Failure(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable exception, int code, @org.jetbrains.annotations.NotNull()
        java.lang.String requestTag, @org.jetbrains.annotations.Nullable()
        T body, int statusCode) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Throwable component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Throwable getException() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRequestTag() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final T component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final T getBody() {
            return null;
        }
        
        public final int component5() {
            return 0;
        }
        
        public final int getStatusCode() {
            return 0;
        }
    }
}
package com.example.testapplication.data.local_db;

import java.lang.System;

/**
 * this app database calss
 */
@androidx.room.Database(entities = {com.example.testapplication.domain.models.response.PeopleItemResponse.class}, exportSchema = false, version = 1)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/testapplication/data/local_db/LocalDb;", "Landroidx/room/RoomDatabase;", "()V", "peopleItemDao", "Lcom/example/testapplication/data/local_db/PeopleItemDao;", "Companion", "app_debug"})
public abstract class LocalDb extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.testapplication.data.local_db.LocalDb.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DB_NAME = "user_list_db";
    private static com.example.testapplication.data.local_db.LocalDb instance;
    
    public LocalDb() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.testapplication.data.local_db.PeopleItemDao peopleItemDao();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/testapplication/data/local_db/LocalDb$Companion;", "", "()V", "DB_NAME", "", "getDB_NAME", "()Ljava/lang/String;", "instance", "Lcom/example/testapplication/data/local_db/LocalDb;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDB_NAME() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.testapplication.data.local_db.LocalDb getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}
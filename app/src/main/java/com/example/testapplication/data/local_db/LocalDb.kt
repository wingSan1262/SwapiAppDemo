package com.example.testapplication.data.local_db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.testapplication.domain.models.response.PeopleItemResponse

@Database(entities = [PeopleItemResponse::class], exportSchema = false, version = 1)
public abstract class LocalDb() : RoomDatabase() {
    companion object {
        val DB_NAME: String = "user_list_db"
        private var instance: LocalDb? = null

        fun getInstance(context: Context): LocalDb {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    LocalDb::class.java,
                    DB_NAME
                )
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return instance!!
        }
    }

    public abstract fun peopleItemDao(): PeopleItemDao
}
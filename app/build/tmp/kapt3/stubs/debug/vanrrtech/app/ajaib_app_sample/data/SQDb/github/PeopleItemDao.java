package vanrrtech.app.ajaib_app_sample.data.SQDb.github;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bH\'J\b\u0010\t\u001a\u00020\u0003H\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000b"}, d2 = {"Lvanrrtech/app/ajaib_app_sample/data/SQDb/github/PeopleItemDao;", "", "deleteUser", "", "movie", "Lvanrrtech/app/ajaib_app_sample/domain/data_model/github/response/PeopleItemResponse;", "insertUsers", "loadAllUser", "", "nukeTable", "updateUser", "app_debug"})
public abstract interface PeopleItemDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "Select * from people_list_table")
    public abstract java.util.List<vanrrtech.app.ajaib_app_sample.domain.data_model.github.response.PeopleItemResponse> loadAllUser();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertUsers(@org.jetbrains.annotations.NotNull()
    vanrrtech.app.ajaib_app_sample.domain.data_model.github.response.PeopleItemResponse movie);
    
    @androidx.room.Update()
    public abstract void updateUser(@org.jetbrains.annotations.NotNull()
    vanrrtech.app.ajaib_app_sample.domain.data_model.github.response.PeopleItemResponse movie);
    
    @androidx.room.Delete()
    public abstract void deleteUser(@org.jetbrains.annotations.NotNull()
    vanrrtech.app.ajaib_app_sample.domain.data_model.github.response.PeopleItemResponse movie);
    
    @androidx.room.Query(value = "DELETE FROM people_list_table")
    public abstract void nukeTable();
}
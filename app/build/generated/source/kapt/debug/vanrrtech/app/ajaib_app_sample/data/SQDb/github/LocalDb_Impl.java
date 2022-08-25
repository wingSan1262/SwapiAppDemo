package vanrrtech.app.ajaib_app_sample.data.SQDb.github;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LocalDb_Impl extends LocalDb {
  private volatile PeopleItemDao _peopleItemDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `people_list_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `height` TEXT NOT NULL, `mass` TEXT NOT NULL, `hairColor` TEXT NOT NULL, `skinColor` TEXT NOT NULL, `eyeColor` TEXT NOT NULL, `birthYear` TEXT NOT NULL, `gender` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2ac78b550d37708d9d6f7ba463afb293')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `people_list_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsPeopleListTable = new HashMap<String, TableInfo.Column>(9);
        _columnsPeopleListTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPeopleListTable.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPeopleListTable.put("height", new TableInfo.Column("height", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPeopleListTable.put("mass", new TableInfo.Column("mass", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPeopleListTable.put("hairColor", new TableInfo.Column("hairColor", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPeopleListTable.put("skinColor", new TableInfo.Column("skinColor", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPeopleListTable.put("eyeColor", new TableInfo.Column("eyeColor", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPeopleListTable.put("birthYear", new TableInfo.Column("birthYear", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPeopleListTable.put("gender", new TableInfo.Column("gender", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPeopleListTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPeopleListTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPeopleListTable = new TableInfo("people_list_table", _columnsPeopleListTable, _foreignKeysPeopleListTable, _indicesPeopleListTable);
        final TableInfo _existingPeopleListTable = TableInfo.read(_db, "people_list_table");
        if (! _infoPeopleListTable.equals(_existingPeopleListTable)) {
          return new RoomOpenHelper.ValidationResult(false, "people_list_table(vanrrtech.app.ajaib_app_sample.domain.data_model.github.response.PeopleItemResponse).\n"
                  + " Expected:\n" + _infoPeopleListTable + "\n"
                  + " Found:\n" + _existingPeopleListTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "2ac78b550d37708d9d6f7ba463afb293", "922b95ebe0d4264bda0100ab8befac0c");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "people_list_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `people_list_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(PeopleItemDao.class, PeopleItemDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public PeopleItemDao peopleItemDao() {
    if (_peopleItemDao != null) {
      return _peopleItemDao;
    } else {
      synchronized(this) {
        if(_peopleItemDao == null) {
          _peopleItemDao = new PeopleItemDao_Impl(this);
        }
        return _peopleItemDao;
      }
    }
  }
}

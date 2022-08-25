package vanrrtech.app.ajaib_app_sample.data.SQDb.github;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import vanrrtech.app.ajaib_app_sample.domain.data_model.github.response.PeopleItemResponse;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PeopleItemDao_Impl implements PeopleItemDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PeopleItemResponse> __insertionAdapterOfPeopleItemResponse;

  private final EntityDeletionOrUpdateAdapter<PeopleItemResponse> __deletionAdapterOfPeopleItemResponse;

  private final EntityDeletionOrUpdateAdapter<PeopleItemResponse> __updateAdapterOfPeopleItemResponse;

  private final SharedSQLiteStatement __preparedStmtOfNukeTable;

  public PeopleItemDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPeopleItemResponse = new EntityInsertionAdapter<PeopleItemResponse>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `people_list_table` (`id`,`name`,`height`,`mass`,`hairColor`,`skinColor`,`eyeColor`,`birthYear`,`gender`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PeopleItemResponse value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getHeight() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getHeight());
        }
        if (value.getMass() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMass());
        }
        if (value.getHairColor() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getHairColor());
        }
        if (value.getSkinColor() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSkinColor());
        }
        if (value.getEyeColor() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getEyeColor());
        }
        if (value.getBirthYear() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getBirthYear());
        }
        if (value.getGender() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getGender());
        }
      }
    };
    this.__deletionAdapterOfPeopleItemResponse = new EntityDeletionOrUpdateAdapter<PeopleItemResponse>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `people_list_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PeopleItemResponse value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfPeopleItemResponse = new EntityDeletionOrUpdateAdapter<PeopleItemResponse>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `people_list_table` SET `id` = ?,`name` = ?,`height` = ?,`mass` = ?,`hairColor` = ?,`skinColor` = ?,`eyeColor` = ?,`birthYear` = ?,`gender` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PeopleItemResponse value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getHeight() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getHeight());
        }
        if (value.getMass() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMass());
        }
        if (value.getHairColor() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getHairColor());
        }
        if (value.getSkinColor() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSkinColor());
        }
        if (value.getEyeColor() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getEyeColor());
        }
        if (value.getBirthYear() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getBirthYear());
        }
        if (value.getGender() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getGender());
        }
        stmt.bindLong(10, value.getId());
      }
    };
    this.__preparedStmtOfNukeTable = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM people_list_table";
        return _query;
      }
    };
  }

  @Override
  public void insertUsers(final PeopleItemResponse movie) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPeopleItemResponse.insert(movie);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteUser(final PeopleItemResponse movie) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfPeopleItemResponse.handle(movie);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateUser(final PeopleItemResponse movie) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfPeopleItemResponse.handle(movie);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void nukeTable() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfNukeTable.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfNukeTable.release(_stmt);
    }
  }

  @Override
  public List<PeopleItemResponse> loadAllUser() {
    final String _sql = "Select * from people_list_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfHeight = CursorUtil.getColumnIndexOrThrow(_cursor, "height");
      final int _cursorIndexOfMass = CursorUtil.getColumnIndexOrThrow(_cursor, "mass");
      final int _cursorIndexOfHairColor = CursorUtil.getColumnIndexOrThrow(_cursor, "hairColor");
      final int _cursorIndexOfSkinColor = CursorUtil.getColumnIndexOrThrow(_cursor, "skinColor");
      final int _cursorIndexOfEyeColor = CursorUtil.getColumnIndexOrThrow(_cursor, "eyeColor");
      final int _cursorIndexOfBirthYear = CursorUtil.getColumnIndexOrThrow(_cursor, "birthYear");
      final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
      final List<PeopleItemResponse> _result = new ArrayList<PeopleItemResponse>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final PeopleItemResponse _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpHeight;
        if (_cursor.isNull(_cursorIndexOfHeight)) {
          _tmpHeight = null;
        } else {
          _tmpHeight = _cursor.getString(_cursorIndexOfHeight);
        }
        final String _tmpMass;
        if (_cursor.isNull(_cursorIndexOfMass)) {
          _tmpMass = null;
        } else {
          _tmpMass = _cursor.getString(_cursorIndexOfMass);
        }
        final String _tmpHairColor;
        if (_cursor.isNull(_cursorIndexOfHairColor)) {
          _tmpHairColor = null;
        } else {
          _tmpHairColor = _cursor.getString(_cursorIndexOfHairColor);
        }
        final String _tmpSkinColor;
        if (_cursor.isNull(_cursorIndexOfSkinColor)) {
          _tmpSkinColor = null;
        } else {
          _tmpSkinColor = _cursor.getString(_cursorIndexOfSkinColor);
        }
        final String _tmpEyeColor;
        if (_cursor.isNull(_cursorIndexOfEyeColor)) {
          _tmpEyeColor = null;
        } else {
          _tmpEyeColor = _cursor.getString(_cursorIndexOfEyeColor);
        }
        final String _tmpBirthYear;
        if (_cursor.isNull(_cursorIndexOfBirthYear)) {
          _tmpBirthYear = null;
        } else {
          _tmpBirthYear = _cursor.getString(_cursorIndexOfBirthYear);
        }
        final String _tmpGender;
        if (_cursor.isNull(_cursorIndexOfGender)) {
          _tmpGender = null;
        } else {
          _tmpGender = _cursor.getString(_cursorIndexOfGender);
        }
        _item = new PeopleItemResponse(_tmpId,_tmpName,_tmpHeight,_tmpMass,_tmpHairColor,_tmpSkinColor,_tmpEyeColor,_tmpBirthYear,_tmpGender);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}

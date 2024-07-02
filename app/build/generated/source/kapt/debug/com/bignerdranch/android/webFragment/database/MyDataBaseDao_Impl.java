package com.bignerdranch.android.webFragment.database;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MyDataBaseDao_Impl implements MyDataBaseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MyData> __insertionAdapterOfMyData;

  private final EntityDeletionOrUpdateAdapter<MyData> __updateAdapterOfMyData;

  public MyDataBaseDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMyData = new EntityInsertionAdapter<MyData>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `mydata` (`PrimaryKey`,`Image`,`name`,`surname`,`group`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final MyData entity) {
        statement.bindLong(1, entity.getPrimaryKey());
        if (entity.getImage() == null) {
          statement.bindNull(2);
        } else {
          statement.bindBlob(2, entity.getImage());
        }
        if (entity.getName() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getName());
        }
        if (entity.getSurname() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getSurname());
        }
        if (entity.getGroup() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getGroup());
        }
      }
    };
    this.__updateAdapterOfMyData = new EntityDeletionOrUpdateAdapter<MyData>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `mydata` SET `PrimaryKey` = ?,`Image` = ?,`name` = ?,`surname` = ?,`group` = ? WHERE `PrimaryKey` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final MyData entity) {
        statement.bindLong(1, entity.getPrimaryKey());
        if (entity.getImage() == null) {
          statement.bindNull(2);
        } else {
          statement.bindBlob(2, entity.getImage());
        }
        if (entity.getName() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getName());
        }
        if (entity.getSurname() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getSurname());
        }
        if (entity.getGroup() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getGroup());
        }
        statement.bindLong(6, entity.getPrimaryKey());
      }
    };
  }

  @Override
  public void insert(final MyData... data) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMyData.insert(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final MyData... data) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfMyData.handleMultiple(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flow<List<MyData>> query() {
    final String _sql = "Select * From MyData";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"MyData"}, new Callable<List<MyData>>() {
      @Override
      @NonNull
      public List<MyData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPrimaryKey = CursorUtil.getColumnIndexOrThrow(_cursor, "PrimaryKey");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "Image");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfSurname = CursorUtil.getColumnIndexOrThrow(_cursor, "surname");
          final int _cursorIndexOfGroup = CursorUtil.getColumnIndexOrThrow(_cursor, "group");
          final List<MyData> _result = new ArrayList<MyData>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final MyData _item;
            final int _tmpPrimaryKey;
            _tmpPrimaryKey = _cursor.getInt(_cursorIndexOfPrimaryKey);
            final byte[] _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getBlob(_cursorIndexOfImage);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpSurname;
            if (_cursor.isNull(_cursorIndexOfSurname)) {
              _tmpSurname = null;
            } else {
              _tmpSurname = _cursor.getString(_cursorIndexOfSurname);
            }
            final String _tmpGroup;
            if (_cursor.isNull(_cursorIndexOfGroup)) {
              _tmpGroup = null;
            } else {
              _tmpGroup = _cursor.getString(_cursorIndexOfGroup);
            }
            _item = new MyData(_tmpPrimaryKey,_tmpImage,_tmpName,_tmpSurname,_tmpGroup);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}

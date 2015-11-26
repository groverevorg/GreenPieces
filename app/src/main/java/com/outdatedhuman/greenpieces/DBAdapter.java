package com.outdatedhuman.greenpieces;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
public class DBAdapter {
    public static final String KEY_ROWID = "_id";
    public static final String KEY_UPC = "upc";
    public static final String KEY_NAME = "name";
    public static final String KEY_PLASTIC_NUMBER = "Pnumber";
    private static final String TAG = "DBAdapter";

    private static final String DATABASE_NAME = "recycling";
    private static final String DATABASE_TABLE = "upcTable";
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_CREATE =
            "create table upcTable (_id integer primary key autoincrement, "
                    + "upc text not null, name text not null, "
                    + "Pnumber text);";

    private final Context context;

    private DatabaseHelper DBHelper;
    private SQLiteDatabase db;

    public DBAdapter(Context ctx)
    {
        this.context = ctx;
        DBHelper = new DatabaseHelper(context);
    }

    private static class DatabaseHelper extends SQLiteOpenHelper
    {
        DatabaseHelper(Context context)
        {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db)
        {
            db.execSQL(DATABASE_CREATE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion,
                              int newVersion)
        {
            Log.w(TAG, "Upgrading database from version " + oldVersion
                    + " to "
                    + newVersion + ", which will destroy all old data");
            db.execSQL("DROP TABLE IF EXISTS titles");
            onCreate(db);
        }
    }

    //---opens the database---
    public DBAdapter open() throws SQLException
    {
        db = DBHelper.getWritableDatabase();
        return this;
    }

    //---closes the database---
    public void close()
    {
        DBHelper.close();
    }

    //---insert a title into the database---
    public long insertUPC(String upc, String name, String pNum)
    {
        ContentValues initialValues = new ContentValues();
        initialValues.put(KEY_UPC, upc);
        initialValues.put(KEY_NAME, name);
        initialValues.put(KEY_PLASTIC_NUMBER, pNum);
        return db.insert(DATABASE_TABLE, null, initialValues);
    }

    //---deletes a particular title---
    public boolean deleteUPC(long rowId)
    {
        return db.delete(DATABASE_TABLE, KEY_ROWID +
                "=" + rowId, null) > 0;
    }

    //---retrieves all the titles---
    public Cursor getAllUPCs()
    {
        return db.query(DATABASE_TABLE, new String[] {
                        KEY_ROWID,
                        KEY_UPC,
                        KEY_NAME,
                        KEY_PLASTIC_NUMBER},
                null,
                null,
                null,
                null,
                null);
    }

    //---retrieves a particular title---
    public Cursor getUPC(long rowId) throws SQLException
    {
        Cursor mCursor =
                db.query(true, DATABASE_TABLE, new String[] {
                                KEY_ROWID,
                                KEY_UPC,
                                KEY_NAME,
                                KEY_PLASTIC_NUMBER
                        },
                        KEY_ROWID + "=" + rowId,
                        null,
                        null,
                        null,
                        null,
                        null);
        if (mCursor != null) {
            mCursor.moveToFirst();
        }
        return mCursor;
    }

    //---updates a title---
    public boolean updateUPC(long rowId, String upc,
                               String name, String pNum)
    {
        ContentValues args = new ContentValues();
        args.put(KEY_UPC, upc);
        args.put(KEY_NAME, name);
        args.put(KEY_PLASTIC_NUMBER, pNum);
        return db.update(DATABASE_TABLE, args,
                KEY_ROWID + "=" + rowId, null) > 0;
    }
}

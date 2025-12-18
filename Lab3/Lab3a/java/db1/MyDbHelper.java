package hua.dit.mobdev.ec.lab3a.db1;

import static hua.dit.mobdev.ec.lab3a.db1.MyContract.MyTableEntry.*;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDbHelper extends SQLiteOpenHelper {

    public static final int DB_VERSION = 1;

    public static final String CREATE_DB_TABLE =
        "CREATE TABLE IF NOT EXISTS " + MY_TABLE + " ( " +
            _ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL , " +
            STRING_VALUE + " TEXT, " +
            INTEGER_VALUE + " INTEGER " +
        ");";

    public static final String DROP_DB_TABLE =
        "DROP TABLE IF EXISTS " + MY_TABLE + ";";

    public MyDbHelper(@Nullable Context context, @Nullable String name) {
        super(context, name, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_DB_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_DB_TABLE);
        onCreate(db);
    }

}

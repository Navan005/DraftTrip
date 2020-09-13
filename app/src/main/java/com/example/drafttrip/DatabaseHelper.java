package com.example.drafttrip;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * The type Database helper.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    /**
     * The constant DATABASE_NAME.
     */
    public static final String DATABASE_NAME="register.db";
    /**
     * The constant TABLE_NAME.
     */
    public static final String TABLE_NAME="registration";
    /**
     * The constant COL_1.
     */
    public static final String COL_1="ID";
    /**
     * The constant COL_2.
     */
    public static final String COL_2="Name";
    /**
     * The constant COL_3.
     */
    public static final String COL_3="Phone";
    /**
     * The constant COL_4.
     */
    public static final String COL_4="Gmail";
    /**
     * The constant COL_5.
     */
    public static final String COL_5="Password";

    /**
     * Instantiates a new Database helper.
     *
     * @param context the context
     */
    public DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT,Name TEXT,Phone TEXT,Gmail TEXT,Password TEXT)");
        }
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME);
            onCreate(db);
        }
    }


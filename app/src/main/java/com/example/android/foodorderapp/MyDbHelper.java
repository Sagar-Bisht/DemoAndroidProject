package com.example.android.foodorderapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDbHelper extends SQLiteOpenHelper {

     final static String DBNAME ="myDataBase.db" ;
    public MyDbHelper(@Nullable Context context) {
        super(context, DBNAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String query = "create table orders " +
                "(id Integer primary key autoincrement ," +
                "name text ," +
                "phnNumber text," +
                "price int," +
                "image int ," +
                "description text," +
                "foodName text)" ;
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists orders ");
        onCreate(sqLiteDatabase);
    }

    public boolean insertData( String name, String phnNumber, int price, int image, String description, String foodName){
        SQLiteDatabase database = getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put("name",name);
        values.put("phnNumber",phnNumber);
        values.put("price",price);
        values.put("image",image);
        values.put("description",description);
        values.put("foodName",foodName);
        long l = database.insert("orders" ,null ,values) ;
        if(l>0){
            return true ;
        }else{
            return false ;
        }
    }
}

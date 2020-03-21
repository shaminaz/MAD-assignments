package com.example.assign09;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.TextView;
public class main2Activity extends SQLiteOpenHelper{
    main2Activity (Context context, String name, SQLiteDatabase.CursorFactory factory,int version)
    {
        super(context,"MovieDB",factory,version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table movieTicket(seatNumber varchar(25) primary key, inNameOf varchar(30),showTiming text,showName text)");
    }
    public void bookTicket(String seatNumber,String inNameOf,String showTiming, String showName)
    {
        ContentValues cv=new ContentValues();
        cv.put("seatNumber",seatNumber);
        cv.put("inNameOf",inNameOf);
        cv.put("showTiming",showTiming);
        cv.put("showName",showName);
        this.getWritableDatabase().insertOrThrow("movieTicket","",cv);
    }

    public void cancelTicket(String seatNumber)
    {
        this.getWritableDatabase().delete("movieTicket","seatNumber='"+seatNumber+"'",null);
    }
    public String listTickets(TextView tickets)
    {
        Cursor cursor=this.getReadableDatabase().rawQuery("select * from movieTicket",null);
        tickets.setText("");
        while(cursor.moveToNext())
        {
            tickets.append(cursor.getString(0)+" "+cursor.getString(1)+" "+cursor.getString(2)+" "+cursor.getString(3)+"\n");
        }
        return String.valueOf(tickets);

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}



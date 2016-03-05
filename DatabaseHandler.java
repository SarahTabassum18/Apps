package com.example.lenovo.foodiedude.database;

/**
 * Created by Lenovo on 1/22/2016.
 */
import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.lenovo.foodiedude.model.FoodCorners;

public class DatabaseHandler extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION=1;

    private static final String DATABASE_NAME="FoodieDude.db";

    private static final String TABLE_NAME="foodcorners";

    private static final String KEY_ID="id";
    private static final String KEY_NAME="name";
    private static final String KEY_ADDRESS="address";
    private static final String KEY_AREA="area";

    public DatabaseHandler(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String CREATE_FoodCorners_TABLE="CREATE TABLE "+ TABLE_NAME +"("
                + KEY_ID +" INTEGER PRIMARY KEY,"
                + KEY_NAME +" TEXT,"
                + KEY_ADDRESS +" TEXT"
                +KEY_AREA +" TEXT" +")";
        db.execSQL(CREATE_FoodCorners_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public void addContact(FoodCorners foodcorner)
    {
		/*SQLiteDatabase db = this.getWritableDatabase();
		String qry ="Insert into "+TABLE_NAME+" ("+KEY_NAME+","+KEY_CONTACTNO+") " +
				"values('"+contact.getName()+"','"+contact.getContactNumber()+"')";
		db.execSQL(qry);*/

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues value=new ContentValues();

        value.put(KEY_NAME, foodcorner.getName());
        value.put(KEY_ADDRESS,foodcorner.getAddress());
        value.put(KEY_AREA,foodcorner.getArea());

        db.insert(TABLE_NAME, null,value);
        db.close();

    }

    public FoodCorners getSingleContact(int id)
    {
        FoodCorners mylist = new FoodCorners();
        SQLiteDatabase db=this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_NAME, new String[] {KEY_ID,KEY_NAME,KEY_ADDRESS,KEY_AREA}, KEY_ID+"=?",new String[]{String.valueOf(id)} ,null, null,null, null);

        if(cursor!=null)
        {
            cursor.moveToFirst();
            mylist=new FoodCorners(Integer.parseInt(cursor.getString(0)), cursor.getString(1),cursor.getString(2),cursor.getString(3));
        }

        return mylist;
    }

    public List<FoodCorners> getAllContact()
    {
        List<FoodCorners> myList=new ArrayList<>();
        String selectquery="SELECT * FROM "+ TABLE_NAME;
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery(selectquery, null);

        if(cursor.moveToFirst())
        {
            do
            {
                FoodCorners foodcorner= new FoodCorners(Integer.parseInt(cursor.getString(0)),cursor.getString(1),cursor.getString(2),cursor.getString(3));
                myList.add(foodcorner);
            }while(cursor.moveToNext());
        }
        return myList;
    }

    public void updateList(FoodCorners foodcorners)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues value=new ContentValues();
        value.put(KEY_NAME, foodcorners.getName());
        value.put(KEY_ADDRESS,foodcorners.getAddress());
        value.put(KEY_AREA,foodcorners.getArea());

        db.update(TABLE_NAME, value, KEY_ID+"=?", new String[]{String.valueOf(foodcorners.getId())});
        db.close();
    }

    public void deleteContact(int id)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        db.delete(TABLE_NAME, KEY_ID+"=?", new String[]{String.valueOf(id)});
        db.close();
    }

}


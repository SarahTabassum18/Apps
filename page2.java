package com.example.lenovo.foodiedude.SecondLayout;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.lenovo.foodiedude.R;

import com.example.lenovo.foodiedude.GPS.GPSTracker;
import com.example.lenovo.foodiedude.database.DatabaseHandler;
import com.example.lenovo.foodiedude.model.FoodCorners;

import java.util.List;

/**
 * Created by Lenovo on 1/6/2016.
 */
public class page2 extends Activity {
    GPSTracker gps1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        populateListView();

       /* DatabaseHandler db=new DatabaseHandler(this);

        Log.d("Inserting: ", "Inserting.....");
        db.addContact(new FoodCorners("KFC", "30,baily road.dhaka-1217", "bailyroad"));
        db.addContact(new FoodCorners("Pizza Hut","30 bailyroad. dhaka -1217","bailyroad"));
        db.addContact(new FoodCorners("Boomers","40,bailyroad.dhaka-1217","bailyroad"));

        Log.d("Reading: ", "Reading....");
        FoodCorners mycoContact=db.getSingleContact(1);
        List<FoodCorners> myList=db.getAllContact();

        for(FoodCorners mycooContact:myList)
        {
            String result="Id: "+ mycoContact.getId()+" Name: "+mycoContact.getName()+" Address: "+ mycoContact.getAddress()+"Area: "+mycoContact.getArea();
            Log.d("Name: ",result);
        }*/
    }

    private void populateListView() {

        gps1 = new GPSTracker(page2.this);
        double latitude = 0;
        double longitude=0;
        if (gps1.canGetLocation()) {
            latitude = gps1.getLatitude();
             longitude = gps1.getLongitude();
        }
        if((latitude>=23.74&&latitude<=23.75)&&(longitude>=90.40&&longitude<=90.41)){
            String[] bailyRoad = {"Nababi Voj", "KFC",
                    "Shwarma House", "Pizzahut",
                    "Boomers", "Subzero Ice-cream",
                    "Hot Cake","Mr. Baker","Thirty3","Dosa Express",
                    "Fakruddin Restaurant","Shwarma Street","Razzels","Swiss","SkyLark"};
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.item_listview, bailyRoad);
            ListView list = (ListView) findViewById(R.id.listview_foodstore);
            list.setAdapter(adapter);
        }



        else{

        String[] gulshan = {"Fish & Co.", "Gloria Jeans Coffee",
                "Village Restaurant", "Char Coal", "Abacus","Banyan Shades","Grass Root Cafe"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.item_listview, gulshan);
            ListView list = (ListView) findViewById(R.id.listview_foodstore);
            list.setAdapter(adapter);
        }




    }

    }


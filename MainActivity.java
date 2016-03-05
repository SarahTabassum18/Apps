package com.example.lenovo.foodiedude;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.lenovo.foodiedude.GPS.GPSTracker;
import com.example.lenovo.foodiedude.SecondLayout.page2;

public class MainActivity extends AppCompatActivity {

    Button btnShowLocation;
    GPSTracker gps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowLocation=(Button)findViewById(R.id.button);
        btnShowLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gps = new GPSTracker(MainActivity.this);
                if (gps.canGetLocation()) {
                    double latitude = gps.getLatitude();
                    double longitude = gps.getLongitude();

                    Toast.makeText(getApplicationContext(),
                            "Your Location is-\nLat: " + latitude + "\nLong:"
                                    + longitude, Toast.LENGTH_LONG).show();
                    Intent i = new Intent(MainActivity.this, page2.class);
                    startActivity(i);
                } else
                    gps.showSettingsAlert();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

   /* public void onButtonClick(View v){
        if(v.getId()==R.id.button)
        {
            Intent i=new Intent(MainActivity.this,page2.class);
            startActivity(i);
        }
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

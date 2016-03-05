package com.example.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String DisplayText="";
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView) findViewById(R.id.display_text_view);
        Button oneButton = (Button) findViewById(R.id.one);
        Button twoButton = (Button) findViewById(R.id.two);
        Button threeButton = (Button) findViewById(R.id.three);
        Button fourButton = (Button) findViewById(R.id.four);
        Button fiveButton = (Button) findViewById(R.id.five);
        Button sixButton = (Button) findViewById(R.id.six);
        Button sevenButton = (Button) findViewById(R.id.seven);
        Button eightButton = (Button) findViewById(R.id.eight);
        Button nineButton = (Button) findViewById(R.id.nine);
        Button zeroButton = (Button) findViewById(R.id.zero);
        Button plusButton = (Button) findViewById(R.id.plus);
        Button equalButton = (Button) findViewById(R.id.equal);

        oneButton.setOnClickListener(this);
        twoButton.setOnClickListener(this);
        threeButton.setOnClickListener(this);
        fourButton.setOnClickListener(this);
        fiveButton.setOnClickListener(this);
        sixButton.setOnClickListener(this);
        sevenButton.setOnClickListener(this);
        eightButton.setOnClickListener(this);
        nineButton.setOnClickListener(this);
        zeroButton.setOnClickListener(this);
        plusButton.setOnClickListener(this);
        equalButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int buttonId = v.getId();

        switch (buttonId) {

            case R.id.one:
                DisplayText = DisplayText + "1";
                display.setText(DisplayText);

                break;

            case R.id.two:
                DisplayText = DisplayText + "2";
                display.setText(DisplayText);


                break;

            case R.id.three:
                DisplayText = DisplayText + "3";
                display.setText(DisplayText);


                break;

            case R.id.four:
                DisplayText = DisplayText + "4";
                display.setText(DisplayText);

                break;

            case R.id.five:
                DisplayText = DisplayText + "5";
                display.setText(DisplayText);

                break;

            case R.id.six:
                DisplayText = DisplayText + "6";
                display.setText(DisplayText);

                break;

            case R.id.seven:
                DisplayText = DisplayText + "7";
                display.setText(DisplayText);

                break;

            case R.id.eight:
                DisplayText = DisplayText + "8";
                display.setText(DisplayText);

                break;

            case R.id.nine:
                DisplayText = DisplayText + "9";
                display.setText(DisplayText);

                break;

            case R.id.zero:
                DisplayText = DisplayText + "0";
                display.setText(DisplayText);

                break;

            case R.id.plus:
                DisplayText = DisplayText + "1";
                display.setText(DisplayText);

                break;

            case R.id.equal:

                DisplayText = DisplayText + "1";
                display.setText(DisplayText);

                int sum = 0;
                for (int i =0; i<numbers.length;i++){

                    int sum

                }

                break;


        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

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

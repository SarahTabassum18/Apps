package bbs.bbs.bbs.basketballscore;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    int team_a_score = 0, team_b_score = 0;

    TextView team_A_Text_View, team_B_Text_View;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        team_A_Text_View = (TextView) findViewById(R.id.team_A_Score);
        team_B_Text_View = (TextView) findViewById(R.id.team_B_Score);
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


    public void Team_A_3_Points_Click(View v)
    {
        team_a_score += 3;
        team_A_Text_View.setText(String.valueOf(team_a_score));
    }

    public void Team_A_2_Points_Click(View v)
    {
        team_a_score += 2;
        team_A_Text_View.setText(String.valueOf(team_a_score));
    }

    public void Team_A_1_Points_Click(View v)
    {
        team_a_score += 1;
        team_A_Text_View.setText(String.valueOf(team_a_score));
    }


    public void Team_B_3_Points_Click(View v)
    {
        team_b_score += 3;
        team_B_Text_View.setText(String.valueOf(team_b_score));
    }

    public void Team_B_2_Points_Click(View v)
    {
        team_b_score += 2;
        team_B_Text_View.setText(String.valueOf(team_b_score));
    }

    public void Team_B_1_Points_Click(View v)
    {
        team_b_score += 1;
        team_B_Text_View.setText(String.valueOf(team_b_score));
    }

    public void ResetButton_Click(View v)
    {
        team_a_score = 0;
        team_b_score = 0;
        team_A_Text_View.setText(String.valueOf(team_a_score));
        team_B_Text_View.setText(String.valueOf(team_b_score));
    }

}

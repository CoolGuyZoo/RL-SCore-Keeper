package com.example.android.rlscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.rlscorekeeper.R;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    //score for Blue
    int scoreBlue = 0;

    //saves for Blue
    int saveBlue = 0;

    //score for Orange
    int scoreOrange = 0;

    //saves for orange
    int saveOrange = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForBlue(0);
    }

    /**
     * Displays the given score for Blue.
     */
    public void displayForBlue(int score) {
        TextView scoreView = (TextView) findViewById(R.id.blue_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the saves for Blue.
     */
    public void savesForBlue(int save) {
        TextView scoreView = (TextView) findViewById(R.id.blue_saves);
        scoreView.setText(String.valueOf(save));
    }

    /**
     * +1 goal for Blue
     */
    public void plusOneGoalForBlue(View view) {
        scoreBlue += 1;
        displayForBlue(scoreBlue);
    }

    /**
     * +1 save for Blue
     */
    public void plusOneSaveForBlue(View view) {
        saveBlue += 1;
        savesForBlue(saveBlue);
    }

    /**
     * Displays the given score for Orange.
     */
    public void displayForOrange(int score) {
        TextView scoreView = (TextView) findViewById(R.id.orange_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the saves for Orange.
     */
    public void savesForOrange(int save) {
        TextView scoreView = (TextView) findViewById(R.id.orange_saves);
        scoreView.setText(String.valueOf(save));
    }

    /**
     * +1 goal for Orange
     */
    public void plusOneGoalForOrange(View view) {
        scoreOrange += 1;
        displayForOrange(scoreOrange);
    }

    /**
     * +1 save for Orange
     */
    public void plusOneSaveForOrange(View view) {
        saveOrange += 1;
        savesForOrange(saveOrange);
    }

    //this method resets all scores to 0

    public void resetGame(View view) {
        scoreBlue = 0;
        scoreOrange = 0;
        saveBlue = 0;
        saveOrange = 0;
        displayForBlue(scoreBlue);
        savesForBlue(saveBlue);
        displayForOrange(scoreOrange);
        savesForOrange(saveOrange);
    }
}

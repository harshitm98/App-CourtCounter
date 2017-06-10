package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score1 = 0;

    public void three_points(View view){
        score1+=3;
        displayForTeamA(score1);
    }

    public void two_points(View view){
        score1+=2;
        displayForTeamA(score1);
    }

    public void free_throw(View view){
        score1+=1;
        displayForTeamA(score1);
    }

    int score = 0;

    public void three_pointsb(View view){
        score+=3;
        displayForTeamB(score);
    }

    public void two_pointsb(View view){
        score+=2;
        displayForTeamB(score);
    }

    public void free_throwb(View view){
        score+=1;
        displayForTeamB(score);
    }

    public void reset(View view){
        score = 0;
        score1 = 0;
        displayForTeamA(score1);
        displayForTeamB(score);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}

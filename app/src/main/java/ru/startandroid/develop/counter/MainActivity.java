package ru.startandroid.develop.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);

    }

    @SuppressLint("DefaultLocale")
    public void addOnePointsForTeamA(View v){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }


    public void displayForTeamA(int s) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.format("%04d",s));
    }

    public void reset(View v){
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
    }



}
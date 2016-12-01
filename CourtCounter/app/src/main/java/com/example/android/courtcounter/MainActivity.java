package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int myScore = 0, myFriendScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addOneForMe(View v){
        myScore=myScore+1;
        displayForMe(myScore);
    }
    public void addOneForMyFriend(View v){
        myFriendScore=myFriendScore+1;
        displayForMyfriend(myFriendScore);
    }
    public void resetScore(View v){
                myScore=0;
                myFriendScore=0;
        displayForMe(myScore);
        displayForMyfriend(myFriendScore);
    }
    public void displayForMe(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForMyfriend(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}

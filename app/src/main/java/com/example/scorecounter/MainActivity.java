package com.example.scorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

//we use implements to get onclicklistener for each button
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //To tracks the score for Team A
    //For Team A one point Textview
    int onePointTeamA = 0;
    //For Team A two point Textview
    int twoPointsTeamA = 0;
    //For Team A three point Textview
    int threePointsTeamA = 0;

    //To tracks the score for Team A
    //For Team B one point Textview
    int onePointTeamB = 0;
    //For Team B two point Textview
    int twoPointsTeamB = 0;
    //For Team B three point Textview
    int threePointsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Team A
        //Getting all of buttons for Team A
        Button teamAaddOne = findViewById(R.id.teamAaddOne);
        Button teamAminusOne =  findViewById(R.id.teamAminusOne);
        Button teamAaddTwo = findViewById(R.id.teamAaddTwo);
        Button teamAaddThree =  findViewById(R.id.teamAaddThree);
        Button teamAminusTwo =  findViewById(R.id.teamAminusTwo);
        Button teamAminusThree =  findViewById(R.id.teamAminusThree);
        //Calling each button and setting them with onclicklistener using implements
        teamAaddOne.setOnClickListener(this);
        teamAminusOne.setOnClickListener(this);
        teamAaddTwo.setOnClickListener(this);
        teamAaddThree.setOnClickListener(this);
        teamAminusTwo.setOnClickListener(this);
        teamAminusThree.setOnClickListener(this);

        //Team B
        //Getting all of buttons for Team B
        Button teamBaddOne = findViewById(R.id.teamBaddOne);
        Button teamBminusOne =  findViewById(R.id.teamBminusOne);
        Button teamBaddTwo =  findViewById(R.id.teamBaddTwo);
        Button teamBminusTwo =  findViewById(R.id.teamBminusTwo);
        Button teamBaddThree =  findViewById(R.id.teamBaddThree);
        Button teamBminusThree =  findViewById(R.id.teamBminusThree);
        teamBaddOne.setOnClickListener(this);
        teamBminusOne.setOnClickListener(this);
        teamBaddTwo.setOnClickListener(this);
        teamBminusTwo.setOnClickListener(this);
        teamBaddThree.setOnClickListener(this);
        teamBminusThree.setOnClickListener(this);
    }

    //Made another methed for onClicklistener using switch loop.
    //whenever a button is press it will thought the switch loop
    @Override
    public void onClick(View v) {
        switch (v.getId() /*to get clicked view id**/) {
            //Team A Buttons
            case R.id.teamAaddOne:
                onePointTeamA = onePointTeamA +1;
                getTeamAonePoint(onePointTeamA);
                dispayteamAscore();
                break;
            case R.id.teamAaddTwo:
                twoPointsTeamA = twoPointsTeamA + 2;
                getTeamAtwoPoint(twoPointsTeamA);
                dispayteamAscore();
                break;
            case R.id.teamAaddThree:
                threePointsTeamA = threePointsTeamA + 3;
                getTeamAthreePoint(threePointsTeamA);
                dispayteamAscore();
                break;
            case R.id.teamAminusOne:
                //the if statment will check the value of textview and if it is greater or equal to 1, it will perform the action in the statement.
                //it means the number not go into negative value. it will stop at 0.
                if (onePointTeamA>=1){
                    onePointTeamA = onePointTeamA -1;
                    getTeamAonePoint(onePointTeamA);
                    dispayteamAscore();
                }
                break;
            case R.id.teamAminusTwo:
                if (twoPointsTeamA>=2){
                    twoPointsTeamA = twoPointsTeamA - 2;
                    getTeamAtwoPoint(twoPointsTeamA);
                    dispayteamAscore();
                }
                break;
            case R.id.teamAminusThree:
                if (threePointsTeamA>=3){
                    threePointsTeamA = threePointsTeamA - 3;
                    getTeamAthreePoint(threePointsTeamA);
                    dispayteamAscore();
                }
                break;
        //Team B Buttons
            case R.id.teamBaddOne:
                onePointTeamB = onePointTeamB + 1;
                getTeamBonePoint(onePointTeamB);
                dispayteamBscore();
                break;
            case R.id.teamBaddTwo:
                twoPointsTeamB = twoPointsTeamB + 2;
                getTeamBtwoPoint(twoPointsTeamB);
                dispayteamBscore();
                break;
            case R.id.teamBaddThree:
                threePointsTeamB = threePointsTeamB + 3;
                getTeamBthreePoint(threePointsTeamB);
                dispayteamBscore();
                break;
            case R.id.teamBminusOne:
                if (onePointTeamB>=1){
                    onePointTeamB = onePointTeamB - 1;
                    getTeamBonePoint(onePointTeamB);
                    dispayteamBscore();
                }
                break;
            case R.id.teamBminusTwo:
                if (twoPointsTeamB>=2){
                    twoPointsTeamB = twoPointsTeamB - 2;
                    getTeamBtwoPoint(twoPointsTeamB);
                    dispayteamBscore();
                }
                break;
            case R.id.teamBminusThree:
                if(threePointsTeamB>=3){
                    threePointsTeamB = threePointsTeamB - 3;
                    getTeamBthreePoint(threePointsTeamB);
                    dispayteamBscore();
                    break;
                }
            default:
                break;
        }
    }
    //Displays the given score for Team A one point.
    public void getTeamAonePoint(int point){
        TextView pointView = findViewById(R.id.teamAOnepointview);
        pointView.setText(String.valueOf(point));
    }
    //Displays the given score for Team A two point.
    public void getTeamAtwoPoint(int point){
        TextView pointView = findViewById(R.id.teamATwopointview);
        pointView.setText(String.valueOf(point));
    }
    //Displays the given score for Team A three point.
    public void getTeamAthreePoint(int point){
        TextView pointView = findViewById(R.id.teamAThreepointview);
        pointView.setText(String.valueOf(point));
    }
    //Displays the given score for Team B one point.
    public void getTeamBonePoint(int point){
        TextView pointView = findViewById(R.id.teamBOnepointview);
        pointView.setText(String.valueOf(point));
    }
    //Displays the given score for Team B two point.
    public void getTeamBtwoPoint(int point){
        TextView pointView = findViewById(R.id.teamBTwopointview);
        pointView.setText(String.valueOf(point));
    }
    //Displays the given score for Team B three point.
    public void getTeamBthreePoint(int point){
        TextView pointView = findViewById(R.id.teamBThreepointview);
        pointView.setText(String.valueOf(point));
    }

    public void dispayteamAscore(){
        int total = onePointTeamA+twoPointsTeamA+threePointsTeamA;
        TextView teamAscore =  findViewById(R.id.teamASocre);
        teamAscore.setText(String.valueOf(total));
    }
    public void dispayteamBscore(){
        int total = onePointTeamB+twoPointsTeamB+threePointsTeamB;
        TextView teamBscore =  findViewById(R.id.teamBSocre);
        teamBscore.setText(String.valueOf(total));
    }

    //This will reset the vale for all textview to 0
    public void reset(View view){
        onePointTeamA = 0;
        getTeamAonePoint(onePointTeamA);
        twoPointsTeamA = 0;
        getTeamAtwoPoint(twoPointsTeamA);
        threePointsTeamA = 0;
        getTeamAthreePoint(threePointsTeamA);
        onePointTeamB = 0;
        getTeamBonePoint(onePointTeamB);
        twoPointsTeamB = 0;
        getTeamBtwoPoint(twoPointsTeamB);
        threePointsTeamB = 0;
        getTeamBthreePoint(threePointsTeamB);
        dispayteamAscore();
        dispayteamBscore();
        Toast.makeText(getApplicationContext(),"Reset to zero",Toast.LENGTH_SHORT).show();
    }
}

package com.example.android.cricketscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button oneRunA, twoRunsA, threeRunsA, fourRunsA, sixRunsA, wideA, noballA, wicketA;
    Button oneRunB, twoRunsB, threeRunsB, fourRunsB, sixRunsB, wideB, noballB, wicketB;
    TextView scoreB, scoreA, ballA, ballB;
    int ballsA = 0, ballsB = 0;
    int totalScoreA=0;
    int totalwicketA = 0;
    int totalScoreB=0;
    int totalwicketB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oneRunA = findViewById(R.id.oneRunA);
        twoRunsA = findViewById(R.id.twoRunsA);
        threeRunsA = findViewById(R.id.threeRunsA);
        fourRunsA = findViewById(R.id.fourRunsA);
        sixRunsA = findViewById(R.id.sixRunsA);
        wicketA = findViewById(R.id.wicketA);
        noballA = findViewById(R.id.noballA);
        wideA = findViewById(R.id.wideA);
        scoreA = findViewById(R.id.scoreA);
        ballA = findViewById(R.id.ballsA);

        oneRunB = findViewById(R.id.oneRunB);
        twoRunsB = findViewById(R.id.twoRunsB);
        threeRunsB = findViewById(R.id.threeRunsB);
        fourRunsB = findViewById(R.id.fourRunsB);
        sixRunsB = findViewById(R.id.sixRunsB);
        wicketB = findViewById(R.id.wicketB);
        noballB = findViewById(R.id.noballB);
        wideB = findViewById(R.id.wideB);
        scoreB = findViewById(R.id.scoreB);
        ballB = findViewById(R.id.ballsB);

        /*Team A*/
        //1 Run
        oneRunA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalScoreA = totalScoreA + 1;
                //ballsA = ballsA + 1;
                displayForTeamA(totalScoreA);
                ballA.setText("Balls Played: "+ (++ballsA));
            }
        });
        //2 Runs
        twoRunsA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalScoreA = totalScoreA + 2;
                displayForTeamA(totalScoreA);
                ballA.setText("Balls Played: "+(++ballsA));
            }
        });
        //3 Runs
        threeRunsA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalScoreA = totalScoreA + 3;
                displayForTeamA(totalScoreA);
                ballA.setText("Balls Played: "+(++ballsA));
            }
        });
        //4 Runs
        fourRunsA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalScoreA = totalScoreA + 4;
                displayForTeamA(totalScoreA);
                ballA.setText("Balls Played: "+(++ballsA));
            }
        });
        //6 Runs
        sixRunsA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalScoreA = totalScoreA + 6;
                displayForTeamA(totalScoreA);
                ballA.setText("Balls Played: "+(++ballsA));
            }
        });
        //Wide
        wideA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalScoreA = totalScoreA + 1;
                displayForTeamA(totalScoreA);
            }
        });
        //No-Ball
        noballA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalScoreA = totalScoreA + 1;
                displayForTeamA(totalScoreA);
            }
        });
        //Wicket
        wicketA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalwicketA = totalwicketA + 1;
                ballA.setText("Balls Played: "+(++ballsA));
                if(totalwicketA >= 10){
                    oneRunA.setEnabled(false);
                    twoRunsA.setEnabled(false);
                    threeRunsA.setEnabled(false);
                    fourRunsA.setEnabled(false);
                    sixRunsA.setEnabled(false);
                    wideA.setEnabled(false);
                    noballA.setEnabled(false);
                    wicketA.setEnabled(false);
                    scoreA.setText("Total Score: "+totalScoreA + "/" + (totalwicketA));
                }
                displayWicketTeamA(totalwicketA);
            }
        });

        /*Team B*/
        //1 Run
        oneRunB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalScoreB = totalScoreB + 1;
                displayForTeamB(totalScoreB);
                ballB.setText("Balls Played: "+(++ballsB));
            }
        });
        //2 Runs
        twoRunsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalScoreB = totalScoreB + 2;
                displayForTeamB(totalScoreB);
                ballB.setText("Balls Played: "+(++ballsB));
            }
        });
        //3 Runs
        threeRunsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalScoreB = totalScoreB + 3;
                displayForTeamB(totalScoreB);
                ballB.setText("Balls Played: "+(++ballsB));
            }
        });
        //4 Runs
        fourRunsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalScoreB = totalScoreB + 4;
                displayForTeamB(totalScoreB);
                ballB.setText("Balls Played: "+(++ballsB));
            }
        });
        //6 Runs
        sixRunsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalScoreB = totalScoreB + 6;
                displayForTeamB(totalScoreB);
                ballB.setText("Balls Played: "+(++ballsB));
            }
        });
        //Wide
        wideB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalScoreB = totalScoreB + 1;
                displayForTeamB(totalScoreB);
            }
        });
        //No-Ball
        noballB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalScoreB = totalScoreB + 1;
                displayForTeamB(totalScoreB);
            }
        });
        //Wicket
        wicketB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalwicketB = totalwicketB + 1;
                ballB.setText("Balls Played: "+(++ballsB));
                if(totalwicketB >= 10){
                    oneRunB.setEnabled(false);
                    twoRunsB.setEnabled(false);
                    threeRunsB.setEnabled(false);
                    fourRunsB.setEnabled(false);
                    sixRunsB.setEnabled(false);
                    wideB.setEnabled(false);
                    noballB.setEnabled(false);
                    wicketB.setEnabled(false);
                    scoreB.setText("Total Score: "+totalScoreB + "/" + (totalwicketB));
                }
                displayWicketTeamB(totalwicketB);
            }
        });
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayWicketTeamA(int wicket) {
        TextView wicketView = findViewById(R.id.wicket_a);
        wicketView.setText(String.valueOf(wicket));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayWicketTeamB(int wicket) {
        TextView wicketView = findViewById(R.id.wicket_b);
        wicketView.setText(String.valueOf(wicket));
    }

    //Resets the Score
    public void resetScore(View v){
        totalScoreA = 0;
        totalScoreB = 0;
        totalwicketA = 0;
        totalwicketB = 0;
        displayForTeamA(totalScoreA);
        displayForTeamB(totalScoreB);
        displayWicketTeamA(totalwicketA);
        displayWicketTeamB(totalwicketB);
        ballsA = 0;
        ballsB = 0;
        ballA.setText("Balls Played: "+(ballsA));
        ballB.setText("Balls Played: "+(ballsB));
        oneRunA.setEnabled(true);
        twoRunsA.setEnabled(true);
        threeRunsA.setEnabled(true);
        fourRunsA.setEnabled(true);
        sixRunsA.setEnabled(true);
        wideA.setEnabled(true);
        noballA.setEnabled(true);
        wicketA.setEnabled(true);
        oneRunB.setEnabled(true);
        twoRunsB.setEnabled(true);
        threeRunsB.setEnabled(true);
        fourRunsB.setEnabled(true);
        sixRunsB.setEnabled(true);
        wideB.setEnabled(true);
        noballB.setEnabled(true);
        wicketB.setEnabled(true);
        scoreA.setText("");
        scoreB.setText("");
    }
}
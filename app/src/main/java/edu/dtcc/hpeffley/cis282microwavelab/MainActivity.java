package edu.dtcc.hpeffley.cis282microwavelab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int timeCook1 = 1;
    int timeCook2 = 2;
    int timeCook3 = 3;
    int timeCook4 = 4;
    int timeCook5 = 5;
    int timeCook6 = 6;
    int timeCook7 = 7;
    int timeCook8 = 8;
    int timeCook9 = 9;
    int timeCook0 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the buttons
        Button btnOne = (Button) findViewById(R.id.btnOne);
        Button btnTwo = (Button) findViewById(R.id.btnTwo);
        Button btnThree = (Button) findViewById(R.id.btnThree);
        Button btnFour = (Button) findViewById(R.id.btnFour);
        Button btnFive = (Button) findViewById(R.id.btnFive);
        Button btnSix = (Button) findViewById(R.id.btnSix);
        Button btnSeven = (Button) findViewById(R.id.btnSeven);
        Button btnEight = (Button) findViewById(R.id.btnEight);
        Button btnNine = (Button) findViewById(R.id.btnNine);
        Button btnZero = (Button) findViewById(R.id.btnZero);
        Button btnStart = (Button) findViewById(R.id.btnCook);
        Button btnStop = (Button) findViewById(R.id.btnStop);

        // Initialize the Text Views
        final TextView tvCookTime = (TextView) findViewById(R.id.tvCookTime);
        final TextView tvFoodDone = (TextView) findViewById(R.id.tvFoodDone);

        // Set up the on click actions of the buttons
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //timeCook = 1;
                tvCookTime.append(String.valueOf(timeCook1));
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //timeCook = 2;
                tvCookTime.append(String.valueOf(timeCook2));
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //timeCook += 3;
                tvCookTime.append(String.valueOf(timeCook3));
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //timeCook += 4;
                tvCookTime.append(String.valueOf(timeCook4));
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //timeCook += 5;
                tvCookTime.append(String.valueOf(timeCook5));
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //timeCook += 6;
                tvCookTime.append(String.valueOf(timeCook6));
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //timeCook += 7;
                tvCookTime.append(String.valueOf(timeCook7));
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //timeCook += 8;
                tvCookTime.append(String.valueOf(timeCook8));
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //timeCook += 9;
                tvCookTime.append(String.valueOf(timeCook9));
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //timeCook += 0;
                tvCookTime.append(String.valueOf(timeCook0));
            }
        });

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                tvFoodDone.setText("DONE!");
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //timeCook = 0;
                tvCookTime.setText("");
                tvFoodDone.setText("");
            }
        });
    }
}

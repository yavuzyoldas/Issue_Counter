package com.yoldas.issuecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button r0c0,r1c1,r1c2,r1c3,r1c4,r2c1,r2c2,r2c3,r2c4,r3c1,r3c2,r3c3,r3c4;
    private TextView r1c5,r2c5,r3c5,r4c5,r4c4,r4c3,r4c2,r4c1;
    private int r1c1_value,r1c2_value,r1c3_value,r1c4_value,r2c1_value,r2c2_value,r2c3_value,r2c4_value,r3c1_value,r3c2_value,r3c3_value,r3c4_value;


    private long doubleClickLastTime = 0L;

    private int mainTotal;
    private int c1_total,c2_total,c3_total,c4_total,r1_total,r2_total,r3_total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setInitialize();


    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){

            case R.id.r0_c0:

                r1c1_value = 0;
                r1c1.setText(String.valueOf(r1c1_value));

                r1c2_value = 0;
                r1c2.setText(String.valueOf(r1c2_value));

                r1c3_value = 0;
                r1c3.setText(String.valueOf(r1c3_value));

                r1c4_value = 0;
                r1c4.setText(String.valueOf(r1c4_value));

                r2c1_value = 0;
                r2c1.setText(String.valueOf(r2c1_value));

                r2c2_value = 0;
                r2c2.setText(String.valueOf(r2c2_value));

                r2c3_value = 0;
                r2c3.setText(String.valueOf(r2c3_value));

                r2c4_value = 0;
                r2c4.setText(String.valueOf(r2c4_value));

                r3c1_value = 0;
                r3c1.setText(String.valueOf(r3c1_value));

                r3c2_value = 0;
                r3c2.setText(String.valueOf(r3c2_value));

                r3c3_value = 0;
                r3c3.setText(String.valueOf(r3c3_value));

                r3c4_value = 0;
                r3c4.setText(String.valueOf(r3c4_value));

                r1_total = 0;
                r1c5.setText(String.valueOf(r1_total));

                r2_total = 0;
                r2c5.setText(String.valueOf(r2_total));

                r3_total = 0;
                r3c5.setText(String.valueOf(r3_total));

                mainTotal = 0;
                r4c5.setText(String.valueOf(mainTotal));

                c1_total = 0;
                r4c1.setText(String.valueOf(c1_total));

                c2_total = 0;
                r4c2.setText(String.valueOf(c2_total));

                c3_total = 0;
                r4c3.setText(String.valueOf(c3_total));

                c4_total = 0;
                r4c4.setText(String.valueOf(c4_total));

                break;

            case R.id.r1_c1:

                if(System.currentTimeMillis() - doubleClickLastTime < 300){
                    doubleClickLastTime = 0;

                    if(r1c1_value > 1) {
                        r1c1_value = r1c1_value - 2;
                        r1c1.setText(String.valueOf(r1c1_value));

                        r1_total = r1_total - 2;
                        r1c5.setText(String.valueOf(r1_total));

                        c1_total = c1_total - 2;
                        r4c1.setText(String.valueOf(c1_total));


                        mainTotal = mainTotal - 2;
                        r4c5.setText(String.valueOf(mainTotal));

                    }
                }else{
                        r1c1_value++;
                        r1c1.setText(String.valueOf(r1c1_value));

                        r1_total++;
                        r1c5.setText(String.valueOf(r1_total));

                        c1_total++;
                        r4c1.setText(String.valueOf(c1_total));

                        mainTotal++;
                        r4c5.setText(String.valueOf(mainTotal));

                        doubleClickLastTime = System.currentTimeMillis();
                }


                break;
            case R.id.r1_c2:

                if(System.currentTimeMillis() - doubleClickLastTime < 300){
                    doubleClickLastTime = 0;

                    if(r1c2_value > 1) {
                        r1c2_value = r1c2_value - 2;
                        r1c2.setText(String.valueOf(r1c2_value));

                        r1_total = r1_total - 2;
                        r1c5.setText(String.valueOf(r1_total));

                        c2_total = c2_total - 2;
                        r4c2.setText(String.valueOf(c2_total));

                        mainTotal = mainTotal - 2;
                        r4c5.setText(String.valueOf(mainTotal));
                    }
                }else{
                    r1c2_value++;
                    r1c2.setText(String.valueOf(r1c2_value));

                    r1_total++;
                    r1c5.setText(String.valueOf(r1_total));

                    c2_total++;
                    r4c2.setText(String.valueOf(c2_total));

                    mainTotal++;
                    r4c5.setText(String.valueOf(mainTotal));

                    doubleClickLastTime = System.currentTimeMillis();
                }
                break;
            case R.id.r1_c3:

                if(System.currentTimeMillis() - doubleClickLastTime < 300){
                    doubleClickLastTime = 0;

                    if(r1c3_value > 1) {
                        r1c3_value = r1c3_value - 2;
                        r1c3.setText(String.valueOf(r1c3_value));

                        r1_total = r1_total - 2;
                        r1c5.setText(String.valueOf(r1_total));

                        c3_total = c3_total - 2;
                        r4c3.setText(String.valueOf(c3_total));

                        mainTotal = mainTotal - 2;
                        r4c5.setText(String.valueOf(mainTotal));
                    }
                }else{

                    r1c3_value++;
                    r1c3.setText(String.valueOf(r1c3_value));

                    r1_total++;
                    r1c5.setText(String.valueOf(r1_total));

                    c3_total++;
                    r4c3.setText(String.valueOf(c3_total));

                    mainTotal++;
                    r4c5.setText(String.valueOf(mainTotal));

                    doubleClickLastTime = System.currentTimeMillis();
                }
                break;
            case R.id.r1_c4:
                if(System.currentTimeMillis() - doubleClickLastTime < 300){
                    doubleClickLastTime = 0;

                    if(r1c4_value > 1) {
                        r1c4_value = r1c4_value - 2;
                        r1c4.setText(String.valueOf(r1c4_value));

                        r1_total = r1_total - 2;
                        r1c5.setText(String.valueOf(r1_total));

                        c4_total = c4_total - 2;
                        r4c4.setText(String.valueOf(c4_total));

                        mainTotal = mainTotal - 2;
                        r4c5.setText(String.valueOf(mainTotal));
                    }
                }else{

                    r1c4_value++;
                    r1c4.setText(String.valueOf(r1c4_value));

                    r1_total++;
                    r1c5.setText(String.valueOf(r1_total));

                    c4_total++;
                    r4c4.setText(String.valueOf(c4_total));

                    mainTotal++;
                    r4c5.setText(String.valueOf(mainTotal));

                    doubleClickLastTime = System.currentTimeMillis();
                }

                break;
            case R.id.r2_c1:
                if(System.currentTimeMillis() - doubleClickLastTime < 300){
                    doubleClickLastTime = 0;

                    if(r2c1_value > 1) {
                        r2c1_value = r2c1_value - 2;
                        r2c1.setText(String.valueOf(r2c1_value));

                        r2_total = r2_total - 2;
                        r2c5.setText(String.valueOf(r2_total));

                        c1_total = c1_total - 2;
                        r4c1.setText(String.valueOf(c1_total));

                        mainTotal = mainTotal - 2;
                        r4c5.setText(String.valueOf(mainTotal));
                    }
                }else{

                    r2c1_value++;
                    r2c1.setText(String.valueOf(r2c1_value));

                    r2_total++;
                    r2c5.setText(String.valueOf(r2_total));

                    c1_total++;
                    r4c1.setText(String.valueOf(c1_total));

                    mainTotal++;
                    r4c5.setText(String.valueOf(mainTotal));

                    doubleClickLastTime = System.currentTimeMillis();
                }

                break;
            case R.id.r2_c2:
                if(System.currentTimeMillis() - doubleClickLastTime < 300){
                    doubleClickLastTime = 0;

                    if(r2c2_value > 1) {
                        r2c2_value = r2c2_value - 2;
                        r2c2.setText(String.valueOf(r2c2_value));

                        r2_total = r2_total - 2;
                        r2c5.setText(String.valueOf(r2_total));

                        c2_total = c2_total - 2;
                        r4c2.setText(String.valueOf(c2_total));

                        mainTotal = mainTotal - 2;
                        r4c5.setText(String.valueOf(mainTotal));
                    }
                }else{

                    r2c2_value++;
                    r2c2.setText(String.valueOf(r2c2_value));

                    r2_total++;
                    r2c5.setText(String.valueOf(r2_total));

                    c2_total++;
                    r4c2.setText(String.valueOf(c2_total));

                    mainTotal++;
                    r4c5.setText(String.valueOf(mainTotal));

                    doubleClickLastTime = System.currentTimeMillis();
                }

                break;
            case R.id.r2_c3:

                if(System.currentTimeMillis() - doubleClickLastTime < 300){
                    doubleClickLastTime = 0;

                    if(r2c3_value > 1) {
                        r2c3_value = r2c3_value - 2;
                        r2c3.setText(String.valueOf(r2c3_value));

                        r2_total = r2_total - 2;
                        r2c5.setText(String.valueOf(r2_total));

                        c3_total = c3_total - 2;
                        r4c3.setText(String.valueOf(c3_total));

                        mainTotal = mainTotal - 2;
                        r4c5.setText(String.valueOf(mainTotal));
                    }
                }else{

                    r2c3_value++;
                    r2c3.setText(String.valueOf(r2c3_value));

                    r2_total++;
                    r2c5.setText(String.valueOf(r2_total));

                    c3_total++;
                    r4c3.setText(String.valueOf(c3_total));

                    mainTotal++;
                    r4c5.setText(String.valueOf(mainTotal));

                    doubleClickLastTime = System.currentTimeMillis();
                }

                break;
            case R.id.r2_c4:
                if(System.currentTimeMillis() - doubleClickLastTime < 300){
                    doubleClickLastTime = 0;

                    if(r2c4_value > 1) {
                        r2c4_value = r2c4_value - 2;
                        r2c4.setText(String.valueOf(r2c4_value));

                        r2_total = r2_total - 2;
                        r2c5.setText(String.valueOf(r2_total));

                        c4_total = c4_total - 2;
                        r4c4.setText(String.valueOf(c4_total));

                        mainTotal = mainTotal - 2;
                        r4c5.setText(String.valueOf(mainTotal));
                    }
                }else{

                    r2c4_value++;
                    r2c4.setText(String.valueOf(r2c4_value));

                    r2_total++;
                    r2c5.setText(String.valueOf(r2_total));

                    c4_total++;
                    r4c4.setText(String.valueOf(c4_total));

                    mainTotal++;
                    r4c5.setText(String.valueOf(mainTotal));

                    doubleClickLastTime = System.currentTimeMillis();
                }

                break;
            case R.id.r3_c1:
                if(System.currentTimeMillis() - doubleClickLastTime < 300){
                    doubleClickLastTime = 0;

                    if(r3c1_value > 1) {
                        r3c1_value = r3c1_value - 2;
                        r3c1.setText(String.valueOf(r3c1_value));

                        r3_total = r3_total - 2;
                        r3c5.setText(String.valueOf(r3_total));

                        c1_total = c1_total - 2;
                        r4c1.setText(String.valueOf(c1_total));

                        mainTotal = mainTotal - 2;
                        r4c5.setText(String.valueOf(mainTotal));
                    }
                }else{

                    r3c1_value++;
                    r3c1.setText(String.valueOf(r3c1_value));

                    r3_total++;
                    r3c5.setText(String.valueOf(r3_total));

                    c1_total++;
                    r4c1.setText(String.valueOf(c1_total));

                    mainTotal++;
                    r4c5.setText(String.valueOf(mainTotal));

                    doubleClickLastTime = System.currentTimeMillis();
                }

                break;
            case R.id.r3_c2:
                if(System.currentTimeMillis() - doubleClickLastTime < 300){
                    doubleClickLastTime = 0;

                    if(r3c2_value > 1) {
                        r3c2_value = r3c2_value - 2;
                        r3c2.setText(String.valueOf(r3c2_value));

                        r3_total = r3_total - 2;
                        r3c5.setText(String.valueOf(r3_total));

                        c2_total = c2_total - 2;
                        r4c2.setText(String.valueOf(c2_total));

                        mainTotal = mainTotal - 2;
                        r4c5.setText(String.valueOf(mainTotal));
                    }
                }else{

                    r3c2_value++;
                    r3c2.setText(String.valueOf(r3c2_value));

                    r3_total++;
                    r3c5.setText(String.valueOf(r3_total));

                    c2_total++;
                    r4c2.setText(String.valueOf(c2_total));

                    mainTotal++;
                    r4c5.setText(String.valueOf(mainTotal));

                    doubleClickLastTime = System.currentTimeMillis();
                }

                break;
            case R.id.r3_c3:
                if(System.currentTimeMillis() - doubleClickLastTime < 300){
                    doubleClickLastTime = 0;

                    if(r3c3_value > 1) {
                        r3c3_value = r3c3_value - 2;
                        r3c3.setText(String.valueOf(r3c3_value));

                        r3_total = r3_total - 2;
                        r3c5.setText(String.valueOf(r3_total));

                        c3_total = c3_total - 2;
                        r4c3.setText(String.valueOf(c3_total));

                        mainTotal = mainTotal - 2;
                        r4c5.setText(String.valueOf(mainTotal));
                    }
                }else{

                    r3c3_value++;
                    r3c3.setText(String.valueOf(r3c3_value));

                    r3_total++;
                    r3c5.setText(String.valueOf(r3_total));

                    c3_total++;
                    r4c3.setText(String.valueOf(c3_total));

                    mainTotal++;
                    r4c5.setText(String.valueOf(mainTotal));

                    doubleClickLastTime = System.currentTimeMillis();
                }

                break;
            case R.id.r3_c4:
                if(System.currentTimeMillis() - doubleClickLastTime < 300){
                    doubleClickLastTime = 0;

                    if(r3c4_value > 1) {
                        r3c4_value = r3c4_value - 2;
                        r3c4.setText(String.valueOf(r3c4_value));

                        r3_total = r3_total - 2;
                        r3c5.setText(String.valueOf(r3_total));

                        c4_total = c4_total - 2;
                        r4c4.setText(String.valueOf(c4_total));

                        mainTotal = mainTotal - 2;
                        r4c5.setText(String.valueOf(mainTotal));
                    }
                }else{

                    r3c4_value++;
                    r3c4.setText(String.valueOf(r3c4_value));

                    r3_total++;
                    r3c5.setText(String.valueOf(r3_total));

                    c4_total++;
                    r4c4.setText(String.valueOf(c4_total));

                    mainTotal++;
                    r4c5.setText(String.valueOf(mainTotal));

                    doubleClickLastTime = System.currentTimeMillis();
                }

                break;

        }


    }

    private void setInitialize(){

        //Buttons

        r0c0 = findViewById(R.id.r0_c0);

        r1c1 = findViewById(R.id.r1_c1);
        r1c2 = findViewById(R.id.r1_c2);
        r1c3 = findViewById(R.id.r1_c3);
        r1c4 = findViewById(R.id.r1_c4);

        r2c1 = findViewById(R.id.r2_c1);
        r2c2 = findViewById(R.id.r2_c2);
        r2c3 = findViewById(R.id.r2_c3);
        r2c4 = findViewById(R.id.r2_c4);

        r3c1 = findViewById(R.id.r3_c1);
        r3c2 = findViewById(R.id.r3_c2);
        r3c3 = findViewById(R.id.r3_c3);
        r3c4 = findViewById(R.id.r3_c4);

        r0c0.setOnClickListener(this);

        r1c1.setOnClickListener(this);
        r1c2.setOnClickListener(this);
        r1c3.setOnClickListener(this);
        r1c4.setOnClickListener(this);

        r2c1.setOnClickListener(this);
        r2c2.setOnClickListener(this);
        r2c3.setOnClickListener(this);
        r2c4.setOnClickListener(this);

        r3c1.setOnClickListener(this);
        r3c2.setOnClickListener(this);
        r3c3.setOnClickListener(this);
        r3c4.setOnClickListener(this);

        //TextViews
        r1c5 = findViewById(R.id.r1_c5);
        r2c5 = findViewById(R.id.r2_c5);
        r3c5 = findViewById(R.id.r3_c5);
        r4c5 = findViewById(R.id.r4_c5);

        r4c4 = findViewById(R.id.r4_c4);
        r4c3 = findViewById(R.id.r4_c3);
        r4c2 = findViewById(R.id.r4_c2);
        r4c1 = findViewById(R.id.r4_c1);

        r1c5.setOnClickListener(this);
        r2c5.setOnClickListener(this);
        r3c5.setOnClickListener(this);
        r4c5.setOnClickListener(this);

        r4c4.setOnClickListener(this);
        r4c3.setOnClickListener(this);
        r4c2.setOnClickListener(this);
        r4c1.setOnClickListener(this);



    }


}

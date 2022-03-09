package com.example.week05_02_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.*;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    Handler hand;
     class myRunabble implements Runnable{
         @Override
         public void run() {

             Log.d("TIMER","BU SENE O SENE");
             hand.postDelayed(this,1000);
         }
     }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         hand = new Handler();

     hand.post(new myRunabble());

    }
}
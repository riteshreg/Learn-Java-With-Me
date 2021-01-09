package com.blogspot.learnjavawithme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.blogspot.learnjavawithme.MainActivities.MainActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

       Thread thread = new Thread(){
           public void run(){

               try {
                   sleep(3000);
                   Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                   startActivity(intent);
                   finish();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

           }
       };
       thread.start();

    }
}
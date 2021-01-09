package com.blogspot.learnjavawithme.MainActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.Toast;

import com.blogspot.learnjavawithme.IntroductionActivities.BasicConcepOfOpps;
import com.blogspot.learnjavawithme.IntroductionActivities.IntroductionActivity;
import com.blogspot.learnjavawithme.ProgramActivities.ConstructorInJava;
import com.blogspot.learnjavawithme.R;
import com.blogspot.learnjavawithme.SplashScreen;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecycleViewClickListener{
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);

        ArrayList<JavaModel> list = new ArrayList<JavaModel>();
        list.add(new JavaModel("Introduction to Java"));
        list.add(new JavaModel("Class And Object"));
        list.add(new JavaModel("Constructor in java"));
        list.add(new JavaModel("Dummy"));
        list.add(new JavaModel("Dummy"));
        list.add(new JavaModel("Dummy"));
        list.add(new JavaModel("Dummy"));
        list.add(new JavaModel("Dummy"));
        list.add(new JavaModel("Dummy"));
        list.add(new JavaModel("Dummy"));
        list.add(new JavaModel("Dummy"));
        list.add(new JavaModel("Dummy"));
        list.add(new JavaModel("Dummy"));
        list.add(new JavaModel("Dummy"));
        list.add(new JavaModel("Dummy"));
        list.add(new JavaModel("Dummy"));
        list.add(new JavaModel("Dummy"));
        list.add(new JavaModel("Dummy"));
        list.add(new JavaModel("Dummy"));
        list.add(new JavaModel("Dummy"));
        list.add(new JavaModel("Dummy"));
        list.add(new JavaModel("Dummy"));

        JavaAdapter adapter = new JavaAdapter(this,list,  this);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void OnItemClick(int position) {

        switch (position){
            case 0:
                Intent intent = new Intent(MainActivity.this, IntroductionActivity.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(MainActivity.this, BasicConcepOfOpps.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(MainActivity.this, ConstructorInJava.class);
                startActivity(intent2);
                break;

        }

    }

    @Override
    public void OnLongItemClick(int position) {

    }
}
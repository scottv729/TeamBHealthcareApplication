package com.example.teamb.teambhealthcareapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startSearching(View view) {
        //starts the clinic search activity
        Intent intent = new Intent(MainActivity.this, Clinic_Search.class);
        startActivity(intent);
    }
}

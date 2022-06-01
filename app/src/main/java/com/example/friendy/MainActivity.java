package com.example.friendy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public void onClick(View view){

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("hello","hello world");

        startActivity(intent);}


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
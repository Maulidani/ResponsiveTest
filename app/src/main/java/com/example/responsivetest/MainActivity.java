package com.example.responsivetest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button login = findViewById(R.id.tosecond);
//        login.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, MainActivity2.class)));
    }
}
package com.example.responsivetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity5.this, MainActivity6.class));
            }
        });

        Log.e("Test", "Kondisi OnCreate");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Test", "Kondisi OnStop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Test", "Kondisi OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Test", "Kondisi OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Test", "Kondisi OnPause");
    }
}
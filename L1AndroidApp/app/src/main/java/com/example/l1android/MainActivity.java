package com.example.l1android;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Button button = findViewById(R.id.button);
            Button button2 = findViewById(R.id.button2);
            // lambda式
            button.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, A2.class);
                startActivity(intent);
            });
            button2.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, A3.class);
                startActivity(intent);
            });



    }
}
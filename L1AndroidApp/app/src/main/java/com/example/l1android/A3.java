package com.example.l1android;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
public class A3 extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        //Button formbtn = findViewById(R.id.button5);
        button4.setOnClickListener(v -> {
            Intent intent = new Intent(A3.this, A34.class);
            startActivity(intent);
        });

        // lambda式
        button5.setOnClickListener(v -> finish());

        /*
        formbtn.setOnClickListener(v -> {
            Intent intent = new Intent(A3.this, A4.class);
            startActivity(intent);
        });

         */
    }
}

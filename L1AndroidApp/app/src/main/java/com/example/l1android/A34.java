package com.example.l1android;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class A34 extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a34);
        Button button6 = findViewById(R.id.button6);
        Button button8 = findViewById(R.id.button8);
        Button button10 = findViewById(R.id.button10);
        Button button12 = findViewById(R.id.button12);

        button8.setOnClickListener(v -> {
            Intent intent = new Intent(A34.this, A345.class);
            startActivity(intent);
        });
        button10.setOnClickListener(v -> {
            Intent intent = new Intent(A34.this, A345.class);
            startActivity(intent);
        });
        button12.setOnClickListener(v -> {
            Intent intent = new Intent(A34.this, A345.class);
            startActivity(intent);
        });
        button6.setOnClickListener(v -> finish());
    }
}

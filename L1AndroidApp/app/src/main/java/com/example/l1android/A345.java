package com.example.l1android;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class A345 extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a345);
        Button b = findViewById(R.id.b);
        Button button7 = findViewById(R.id.button7);
        Button button9 = findViewById(R.id.button9);

        b.setOnClickListener(v -> {
            Intent intent = new Intent(A345.this, A4.class);
            startActivity(intent);
        });
        button7.setOnClickListener(v -> {
            Intent intent = new Intent(A345.this, A345.class);
            startActivity(intent);
        });
        button9.setOnClickListener(v -> {
            Intent intent = new Intent(A345.this, A345.class);
            startActivity(intent);
        });
        //b.setOnClickListener(v -> finish());
    }
}

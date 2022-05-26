package com.example.l1android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class A5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //activity_subレイアウトをセット
        setContentView(R.layout.a5);

        Button returnButton = findViewById(R.id.return_btn);
        returnButton.setOnClickListener(v -> {
            Intent intent = new Intent(A5.this, MainActivity.class);
            startActivity(intent);
        });
    }

}
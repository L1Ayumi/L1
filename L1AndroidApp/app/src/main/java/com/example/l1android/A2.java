package com.example.l1android;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class A2 extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a2);
        Button button3 = findViewById(R.id.button3);
        Button eventbtn = findViewById(R.id.data);

        //TextView textview1 = findViewById(R.id.data);




        // lambda式
        button3.setOnClickListener(v -> finish());

        eventbtn.setOnClickListener(v -> {
            Intent intent = new Intent(A2.this, A3.class);
            startActivity(intent);
        });

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("event");

        //myRef.setValue("Hello, World!");
        Log.d(TAG , "aaaaaaaa " );

        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                Log.d(TAG , "bbbbbbbbb " );
                // whenever data at this location is updated.
                //String value = dataSnapshot.getValue(String.class);
                for (DataSnapshot snapshot : dataSnapshot.getChildren()){
                    DataSnapshot data1 = snapshot.child("title");
                    DataSnapshot data2 = snapshot.child("date");
                    DataSnapshot data3 = snapshot.child("time");
                    DataSnapshot data4 = snapshot.child("artist");
                    DataSnapshot data5 = snapshot.child("price");
                    DataSnapshot data6 = snapshot.child("explanation");
                    String value1 = data1.getValue(String.class);
                    String value2 = data2.getValue(String.class);
                    String value3 = data3.getValue(String.class);
                    String value4 = data4.getValue(String.class);
                    String value5 = data5.getValue(String.class);
                    String value6 = data6.getValue(String.class);
                    String value = value1 + "\r\n" + value2 + "\r\n" + value3 + "\r\n"
                            + value4 + "\r\n" + value5 + "\r\n" + value6; //"\r\n"改行コード
                    Log.d(TAG , "Value is: " + value);
                    eventbtn.setText(value);
                }

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

    }

}

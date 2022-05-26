package com.example.l1android;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import java.util.HashMap;

public class A4 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4);

    Button changeButton = findViewById(R.id.change_btn);

        changeButton.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
// Firebase データベースへの書き込み
            EditText edit1 = findViewById(R.id.editTextTextEmailAddress);
            EditText edit2 = findViewById(R.id.editTextTextPersonName11);
            EditText edit3 = findViewById(R.id.editTextTextPersonName8);
            EditText edit4 =  findViewById(R.id.editTextTextPersonName4);
            EditText edit5 =  findViewById(R.id.editTextDate);
            EditText edit6 =  findViewById(R.id.editTextTextPersonName7);
            EditText edit7 =  findViewById(R.id.editTextPhone);
            EditText edit8 =  findViewById(R.id.editTextTime);
            EditText edit9 = findViewById(R.id.editTextNumber);
            EditText edit10 = findViewById(R.id.editTextNumber2);
            HashMap<String,String> map=new HashMap();
            map.put("mail",edit1.getText().toString());
            map.put("address",edit2.getText().toString());
            map.put("name",edit3.getText().toString());
            map.put("sex",edit4.getText().toString());
            map.put("birthday",edit5.getText().toString());
            map.put("how long",edit6.getText().toString());
            map.put("phone",edit7.getText().toString());
            map.put("pay",edit8.getText().toString());
            map.put("company",edit9.getText().toString());
            map.put("employee",edit10.getText().toString());
            map.put("stay","森の隠れ家");



            reference.child("users").push().setValue(map);
            //SubActivityに画面遷移
            Intent intent = new Intent(getApplication(), A6.class);
            intent.putExtra("booking",map);
            startActivity(intent);
        }
    });

//       NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
//        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//
//        binding.fab.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

//    @Override
//    public boolean onSupportNavigateUp() {
//       NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
//        return NavigationUI.navigateUp(navController, appBarConfiguration);
//        super.onSupportNavigateUp();
//
//        return true;
//    }
}
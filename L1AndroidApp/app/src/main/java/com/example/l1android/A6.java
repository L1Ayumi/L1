package com.example.l1android;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class A6 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a6);
        final CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        Button changeButton = findViewById(R.id.change_btn1);
        changeButton.setEnabled(false);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
//                    Toast.makeText(getApplication(), "チェックが付いた", Toast.LENGTH_LONG).show();
                } else {
//                    Toast.makeText(getApplication(), "チェックが外れた", Toast.LENGTH_LONG).show();
                }
                changeButton.setEnabled(isChecked);
            }
        });

        Intent intent = this.getIntent();
        HashMap map = (HashMap) intent.getSerializableExtra("booking");
        TextView text1=findViewById(R.id.check1);
        TextView text2=findViewById(R.id.check2);
        TextView text3=findViewById(R.id.check3);
        TextView text4=findViewById(R.id.check4);
        TextView text5=findViewById(R.id.check5);
        TextView text6=findViewById(R.id.check6);
        TextView text7=findViewById(R.id.check7);
        TextView text8=findViewById(R.id.check8);
        TextView text9=findViewById(R.id.check9);
        TextView text10=findViewById(R.id.check10);
        TextView text11=findViewById(R.id.check11);

        String name = (String)map.get("name");
        text1.setText("氏名:"+name);
        String sex = (String)map.get("sex");
        text2.setText("性別:"+sex);
        String birthday = (String)map.get("birthday");
        text3.setText("生年月日:"+birthday);
        String address = (String)map.get("address");
        text4.setText("住所:"+address);
        String phone = (String)map.get("phone");
        text5.setText("電話番号:"+phone);
        String mail = (String)map.get("mail");
        text6.setText("メールアドレス:"+mail);
        String pay = (String)map.get("pay");
        text7.setText("決済方法:"+pay);
        String howLong = (String)map.get("how long");
        text8.setText("宿泊日:"+howLong);
        String company = (String)map.get("company");
        text9.setText("企業コード:"+company);
        String employee = (String)map.get("employee");
        text10.setText("社員番号:"+employee);
        String stay = (String)map.get("stay");
        text11.setText("場所:"+stay);

        changeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //SubActivityに画面遷移
                Intent intent = new Intent(getApplication(), A5.class);
                startActivity(intent);
            }
        });
    }}


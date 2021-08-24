package com.example.mynewtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Date;

public class
Third_activity extends AppCompatActivity {
    TextView email_Address, password;
    String data, data1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_activity);
        Intent intent = getIntent();
        data = intent.getStringExtra("Data");
        data1 = intent.getStringExtra("Data1");

        email_Address = findViewById(R.id.Email_Address);
        password = findViewById(R.id.Password);
        email_Address.setText(data);
        password.setText(data1);

    }
}
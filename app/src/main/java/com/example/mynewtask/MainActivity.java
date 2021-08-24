package com.example.mynewtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextInputEditText Email_Address, Password;
    Button login_BT;
    ImageView Back_IV;
    TextView create_account_tv;
    TextView change_password;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initization();
//
//        Login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//
//
//            }
//        });

//        Suraj.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
    }

    private void initization() {
        Email_Address = findViewById(R.id.emailaddress_et);
        Password = findViewById(R.id.password_et);

        login_BT = findViewById(R.id.login_BT);
        login_BT.setOnClickListener(this);

        Back_IV = findViewById(R.id.Back_IV);
        Back_IV.setOnClickListener(this);

        change_password = findViewById(R.id.change_password);
        change_password.setOnClickListener(this);

        create_account_tv = findViewById(R.id.create_account_tv);
        create_account_tv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login_BT:
                String Data = Email_Address.getText().toString();
                String Data1 = Password.getText().toString();
                if (Email_Address.length() == 0) {
                    Email_Address.setError("Fill your Email Address");
                } else if (!Data.matches(emailPattern)) {
                    Email_Address.setError("Invalid email !");

                } else if (Password.length() < 6) {
                    Password.setError("Please Enter password minimum in 6 char");
                } else {
                    Toast.makeText(this, "Login Succesfully", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, recycler_main.class);
                    //intent.putExtra("Data", Data);
                    // intent.putExtra("Data1", Data1);
                    startActivity(intent);

                }
                break;

            case R.id.change_password:
                Intent change_passwordintent = new Intent(this, ForgetPassword.class);
                startActivity(change_passwordintent);
                break;

            case R.id.create_account_tv:
                Intent createaccountintent = new Intent(this, CreateAccount.class);
                startActivity(createaccountintent);
                break;

            case R.id.Back_IV:
                Toast.makeText(this, "Welcome Again", Toast.LENGTH_SHORT).show();

                finish();
                break;
        }
    }
}



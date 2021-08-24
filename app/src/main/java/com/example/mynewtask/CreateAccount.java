package com.example.mynewtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.regex.Pattern;

public class CreateAccount extends AppCompatActivity implements View.OnClickListener {
    TextInputEditText Email, PhoneNumber, Password, ConfirmPassword, FirstName, LastName;
    Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        Initialization();


    }

    public void Initialization() {
        Email = findViewById(R.id.Register_Email_btn);
        PhoneNumber = findViewById(R.id.Register_Phonenumber);
        Password = findViewById(R.id.Register_Password);
        ConfirmPassword = findViewById(R.id.Register_ConfirmPassword);
        FirstName = findViewById(R.id.Register_firstName);
        LastName = findViewById(R.id.Register_LastName);

        Register = findViewById(R.id.Register_Button);
        Register.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String pass = Password.getText().toString();
        String Cpassword = ConfirmPassword.getText().toString();

        if (Email.length() == 0) {
            Email.setError("Fill your Email Address");
            //Toast.makeText(this, "Please Enter Email Address", Toast.LENGTH_SHORT).show();
        } else if (!Patterns.EMAIL_ADDRESS.matcher(Email.getText().toString()).matches()) {
            Email.setError("Please Enter Valid Email");
        } else if (!PhoneNumber.getText().toString().matches("[6-9][0-9]{10}")) {
            PhoneNumber.setError("Enter only 10 digit Mobile Number");
        } else if (!FirstName.getText().toString().matches("[a-z,A-Z]*")) {
            FirstName.setError("Enter Only Character");
        } else if (!LastName.getText().toString().matches("[a-z,A-Z]*")) {
            LastName.setError("Enter Only Character");
        } else if (pass.length() < 6) {
            Password.setError("Please Entper Password Minimum in 6 char");
        } else if (!Cpassword.equals(pass)) {
            ConfirmPassword.setError("Both password are Not Matched");
        }
        //  else {

        // }
        Toast.makeText(this, "Register Succesfully", Toast.LENGTH_LONG).show();
        // Intent intent=new Intent(CreateAccount.this,MainActivity.class);
        //  startActivity(intent);
        finish();
    }
}



package com.example.mynewtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ForgetPassword extends AppCompatActivity implements View.OnClickListener {
    TextInputEditText PhoneNumber, Email, Newpassword, ConfirmPassword;
    Button ChangePassword;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    //public View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        initization();

    }

    public void initization() {
        PhoneNumber = findViewById(R.id.Forget_PhoneNumber_btn);
        Email = findViewById(R.id.Forger_Email_btn);
        Newpassword = findViewById(R.id.Forger_NewPassword_btn);
        ConfirmPassword = findViewById(R.id.Forget_ConfirmPassword_btn);

        ChangePassword = findViewById(R.id.ChangePassword_button);
        ChangePassword.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        String pass = Newpassword.getText().toString();
        String cPass = ConfirmPassword.getText().toString();


        if (Email.length() == 0) {
            Email.setError("Fill your Email Address");

            //  Toast.makeText(this, "Please Enter Email Address", Toast.LENGTH_SHORT).show();
        } else if (!Patterns.EMAIL_ADDRESS.matcher(Email.getText().toString()).matches()) {
            Email.setError("Please Enter Valid Email");
        } else if (!PhoneNumber.getText().toString().matches("[0-9]{10}")) {
            PhoneNumber.setError("Enter Valid Phone Number");
        } else if (pass.length() < 6) {
            Newpassword.setError("Please Enter password minimum in 6 char");
        } else if (!pass.equals(cPass)) {
            ConfirmPassword.setError("Both password are not Matched");
        } else {
            Toast.makeText(this, "Password Change Succesfully", Toast.LENGTH_LONG).show();

            Intent intent = new Intent(ForgetPassword.this, MainActivity.class);
            startActivity(intent);

        }
    }
}
     /*  else if (!data.matches(String.valueOf(emailPattern)))
        {
            Email.setError("Invalid email !");

        }

        else if (PhoneNumber.length()==0){
            PhoneNumber.setError("Enter your Phone Number");
                }
        else if(Newpassword.length()==0){
            PhoneNumber.setError("Empty New Password");
                }
                else if (ConfirmPassword.length() == 0) {
                    ConfirmPassword.setError("Enter your password");
                }
                else {
                    Toast.makeText(this, "Password Change Successfully", Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(ForgetPassword.this,MainActivity.class);
                    startActivity(intent);
                }
                    finish();

        }
        }
      */





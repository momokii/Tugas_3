package com.example.tugas_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ResetPasswordActivity extends AppCompatActivity {


    private Button ResetPassword;
    private ImageButton backButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);


        ResetPassword = findViewById(R.id.buttonChangePass);

        ResetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent masuk = new Intent(ResetPasswordActivity.this, SuccessResetPasswordActivity.class);

                startActivity(masuk);

            }
        });


        backButton = findViewById(R.id.backbtn);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent backPage = new Intent(ResetPasswordActivity.this, ForgotPasswordActivity.class);

                startActivity(backPage);

            }
        });



    }
}
package com.example.tugas_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ForgotPasswordActivity extends AppCompatActivity {

    private Button sendReq;
    private ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        sendReq = findViewById(R.id.buttonSendreq);



        sendReq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent resetPass = new Intent(ForgotPasswordActivity.this, ResetPasswordActivity.class );

                startActivity(resetPass);

            }
        });


        backButton = findViewById(R.id.back);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent backPage = new Intent(ForgotPasswordActivity.this, WelcomeActivity.class);

                startActivity(backPage);

            }
        });


    }


}
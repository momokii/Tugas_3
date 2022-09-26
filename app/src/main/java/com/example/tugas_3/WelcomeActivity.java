package com.example.tugas_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {



    private Button ForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        ForgotPassword = findViewById(R.id.forgotPassword);


        ForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent masuk = new Intent(WelcomeActivity.this, ForgotPasswordActivity.class);

                startActivity(masuk);

            }
        });




    }
}
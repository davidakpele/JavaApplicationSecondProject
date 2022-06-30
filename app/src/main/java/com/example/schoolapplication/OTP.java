package com.example.schoolapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OTP extends AppCompatActivity {
    TextView GobackBtb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        GobackBtb = findViewById(R.id.backbtn);
        GobackBtb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OTP.this, sqlLite.class);
                startActivity(intent);
            }
        });
    }
}
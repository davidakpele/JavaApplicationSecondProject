package com.example.schoolapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class resetpassword extends AppCompatActivity {
    TextView GobackBtb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resetpassword);
        GobackBtb = findViewById(R.id.backbtn);
        GobackBtb.setOnClickListener(View ->{
                Intent intent = new Intent(resetpassword.this, sqlLite.class);
                startActivity(intent);
        });
    }
}
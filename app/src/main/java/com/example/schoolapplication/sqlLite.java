package com.example.schoolapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sqlLite extends AppCompatActivity {
    TextView GobackBtb, forgotpasswordlink;
    Button Login;
    EditText Username, UserPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql_lite);

        GobackBtb = findViewById(R.id.backbtn);
        Username =  findViewById(R.id.Username);
        UserPassword =  findViewById(R.id.Password);
        Login =  findViewById(R.id.buttonLogin);
        forgotpasswordlink = findViewById(R.id.forgotpasswordlink);
        String username = Username.getText().toString();
        String Password = UserPassword.getText().toString();
        Login.setOnClickListener(View -> {
            Intent intent = new Intent(sqlLite.this, OTP.class);
            startActivity(intent);
        });
        forgotpasswordlink.setOnClickListener(view -> {
            Intent intent = new Intent(sqlLite.this, resetpassword.class);
            startActivity(intent);
        });
        GobackBtb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sqlLite.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}


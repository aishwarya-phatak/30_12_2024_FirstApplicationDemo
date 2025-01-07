package com.bitcode.firstapplicationdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

//way 2 - attaching listeners by implementing interface at class level
public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    TextView welcomeTextView;
    EditText edtUsername, edtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        welcomeTextView = findViewById(R.id.welcomeTextView);
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == btnLogin) {
            if ((edtUsername.getText().toString().equals("Lokesh")) &&
                    (edtPassword.getText().toString().equals("Bitcode@1234"))) {
//                Toast.makeText(this, "Login Successful!", Toast.LENGTH_LONG).show();
                welcomeTextView.setText("Welcome " + edtUsername.getText().toString());
            } else {
                Toast.makeText(this, "Login Unsuccessful!", Toast.LENGTH_LONG).show();
            }
        }
    }
}
package com.bitcode.firstapplicationdemo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainContainer = new LinearLayout(this);
        mainContainer.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);

        LinearLayout.LayoutParams linearLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );

        mainContainer.setLayoutParams(linearLayoutParams);

        LinearLayout.LayoutParams layoutParamsForViews = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        TextView welcomeMessageTextView = new TextView(this);
        welcomeMessageTextView.setText("Welcome To Bitcode For Android!");
        welcomeMessageTextView.setBackgroundColor(R.color.white);
        welcomeMessageTextView.setTextColor(R.color.black);
        welcomeMessageTextView.setTextSize(20.0F);

        welcomeMessageTextView.setLayoutParams(layoutParamsForViews);

        mainContainer.addView(welcomeMessageTextView);

        EditText usernameEditText = new EditText(this);
        usernameEditText.setTextSize(20.0F);
        usernameEditText.setHint("Enter your username");
        usernameEditText.setBackgroundColor(R.color.white);
        usernameEditText.setTextColor(R.color.black);

        usernameEditText.setLayoutParams(layoutParamsForViews);
        mainContainer.addView(usernameEditText);

        EditText passwordEditText = new EditText(this);
        passwordEditText.setTextColor(R.color.black);
        passwordEditText.setBackgroundColor(R.color.white);
        passwordEditText.setTextSize(20.0F);
        passwordEditText.setLayoutParams(layoutParamsForViews);

        mainContainer.addView(passwordEditText);

        Button btnLogin = new Button(this);
        btnLogin.setTextSize(20.0F);
        btnLogin.setText("Login");
        btnLogin.setBackgroundColor(R.color.white);
        btnLogin.setTextColor(R.color.black);
        btnLogin.setLayoutParams(layoutParamsForViews);

        mainContainer.addView(btnLogin);

        setContentView(mainContainer);
        Toast.makeText(this, "onCreate Method is Called", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart Method is Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume Method is Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this, "onPause Method is Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "OnRestart", Toast.LENGTH_SHORT).show();
    }
}
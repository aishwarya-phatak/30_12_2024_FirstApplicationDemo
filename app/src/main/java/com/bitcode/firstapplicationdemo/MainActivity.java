package com.bitcode.firstapplicationdemo;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
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

    LinearLayout mainContainer;
    TextView welcomeMessageTextView;
    EditText usernameEditText,passwordEditText;
    Button btnLogin;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainContainer = new LinearLayout(this);
        mainContainer.setPadding(20,20,20,20);
        mainContainer.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        mainContainer.setOrientation(LinearLayout.VERTICAL);

        ViewGroup.LayoutParams linearLayoutParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );

        mainContainer.setLayoutParams(linearLayoutParams);

        ViewGroup.LayoutParams layoutParamsForViews = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        welcomeMessageTextView = new TextView(this);
        welcomeMessageTextView.setText(R.string.welcome_message);
        welcomeMessageTextView.setBackgroundColor(Color.CYAN);
        welcomeMessageTextView.setTextColor(Color.BLACK);
        welcomeMessageTextView.setTextSize(20.0F);
        welcomeMessageTextView.setPadding(20,20,20,20);
        welcomeMessageTextView.setLayoutParams(layoutParamsForViews);

        mainContainer.addView(welcomeMessageTextView);

        usernameEditText = new EditText(this);
        usernameEditText.setHint("Enter your username");
        usernameEditText.setLayoutParams(layoutParamsForViews);

        mainContainer.addView(usernameEditText);

        passwordEditText = new EditText(this);
        passwordEditText.setHint("Enter your password");
        passwordEditText.setLayoutParams(layoutParamsForViews);

        mainContainer.addView(passwordEditText);

        btnLogin = new Button(this);
        btnLogin.setTextSize(20.0F);
        btnLogin.setText(R.string.login);
        btnLogin.setBackgroundColor(Color.GRAY);
        btnLogin.setTextColor(Color.BLACK);
        btnLogin.setPadding(20,20,20,20);
        btnLogin.setLayoutParams(layoutParamsForViews);

        //pass the object of such a class that implements interface
        btnLogin.setOnClickListener(new MyBtnLoginClickListener());

        mainContainer.addView(btnLogin);

        setContentView(mainContainer);
        Toast.makeText(this, "onCreate Method is Called", Toast.LENGTH_LONG).show();
    }

    //way 1 - of attaching listeners
    class MyBtnLoginClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            if (view == btnLogin){
                if((usernameEditText.getText().toString().equals("Bitcode"))
                        && (passwordEditText.getText().toString().equals("Bitcode@1234"))){
                    Toast.makeText(MainActivity.this,"Login Success",Toast.LENGTH_LONG).show();
                }
            }
        }
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
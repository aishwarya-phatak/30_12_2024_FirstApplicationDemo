package com.bitcode.firstapplicationdemo;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    Resources resources;
    String welcomeMessage, username;
    String [] colours, names;
    int [] numbers,rollNumbers;
    int colour_blue;
    float dimension_width;

    TextView txtView;
    Button btnLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);

        resources = getResources();
        txtView = findViewById(R.id.txtView);
        btnLogin = findViewById(R.id.btnLogin);

        welcomeMessage = resources.getString(R.string.welcome_message);
        username = resources.getString(R.string.username);
        names = resources.getStringArray(R.array.names);
        colours = resources.getStringArray(R.array.colours);
        numbers = resources.getIntArray(R.array.numbers);
        rollNumbers = resources.getIntArray(R.array.roll_numbers);
        colour_blue = resources.getColor(R.color.light_blue);
        dimension_width = resources.getDimension(R.dimen.width);

        for (int i = 0; i < colours.length; i++) {
            Log.e("tag",colours[i]);
        }

        for(int eachRollNumber : rollNumbers){
            Log.e("tag",eachRollNumber + "");
        }

        //way 3 -- reference of interface to object of class
//        View.OnClickListener onClickListener = new MyBtnLoginClickListener();
//        btnLogin.setOnClickListener(onClickListener);


        //way 4 -- passing an object of anonymous class
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DashboardActivity.this,"Login Success!", Toast.LENGTH_LONG).show();
            }
        });
    }

    class MyBtnLoginClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Toast.makeText(DashboardActivity.this,"Login!",Toast.LENGTH_LONG).show();
        }
    }

}
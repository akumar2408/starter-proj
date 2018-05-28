package com.example.aayushkumar04.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView firstStatement;
    private TextView secondStatement;
    private TextView thirdStatement;
    private TextView mainButton;
    private TextView toastButton;

    boolean isHelloDisplayed = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        firstStatement = findViewById(R.id.first_statement);
        secondStatement = findViewById(R.id.second_statement);
        thirdStatement = findViewById(R.id.third_statement);
        mainButton = findViewById(R.id.main_button);
        toastButton = findViewById(R.id.toast_button);

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hehehe.", Toast.LENGTH_LONG).show();
            }
        });
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String introText = isHelloDisplayed ? "Bye" : "Hello";
                firstStatement.setText(introText + " Arjun!");
                secondStatement.setText(introText + " Aayush!");
                thirdStatement.setText(introText + " Hemant!");
                isHelloDisplayed = !isHelloDisplayed;
            }
        });
    }
}

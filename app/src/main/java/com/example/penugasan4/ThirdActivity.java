package com.example.penugasan4;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    private TextView welcomeMessageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        welcomeMessageTextView = findViewById(R.id.welcomeMessage);

        // Retrieve the username passed from MainActivity
        String username = getIntent().getStringExtra("USERNAME_KEY");

        // Set the welcome message dynamically
        welcomeMessageTextView.setText("Welcome " + username);
    }
}

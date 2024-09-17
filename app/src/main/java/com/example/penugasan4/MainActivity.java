package com.example.penugasan4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText, passwordEditText;

    private String registeredUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        Button loginButton = findViewById(R.id.loginButton);
        // Retrieve the username passed from the registration activity
        Intent intent = getIntent();
        registeredUsername = intent.getStringExtra("USERNAME_KEY"); // Get the username

        // Login button click listener
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredUsername = usernameEditText.getText().toString();
                String enteredPassword = passwordEditText.getText().toString();

                // Simulate login check (you can add actual validation here)
                if (enteredUsername.equals(registeredUsername)) {
                    // If login is successful, display the welcome message
                    Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                    intent.putExtra("USERNAME_KEY", registeredUsername); // Pass the username to the next activity
                    startActivity(intent);
                } else {
                    // Handle invalid login (you can show a message or handle the error)
                }
            }
        });

        // Register text click listener (optional)
        findViewById(R.id.registerText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
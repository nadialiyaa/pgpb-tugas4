package com.example.penugasan4;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private EditText usernameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        usernameEditText = findViewById(R.id.registerUsername);
        Button registerButton = findViewById(R.id.registerButton);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the entered username during registration
                String username = usernameEditText.getText().toString();

                // Store the username and pass it to MainActivity
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                intent.putExtra("USERNAME_KEY", username); // Pass the username
                startActivity(intent); // Start MainActivity (login screen)
            }
        });

        // "Already Have an Account? Log in" TextView click listener
        findViewById(R.id.registerText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Go back to MainActivity (login screen)
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

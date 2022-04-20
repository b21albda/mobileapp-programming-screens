package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView statusMsg = findViewById(R.id.status_msg);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String email = extras.getString("EMAIL");
            String name = extras.getString("NAME");

            if (email.isEmpty() || name.isEmpty()) {
                statusMsg.setText("Profile could not be created");
            }
            else {
                statusMsg.setText("Profile created with");

                TextView emailView = findViewById(R.id.email);
                TextView nameView = findViewById(R.id.name);

                emailView.setText("Email: " + email);
                nameView.setText("Name: " + name);
            }
        }
    }
}
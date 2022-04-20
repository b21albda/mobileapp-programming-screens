package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.createButton);
        EditText inputEmail = findViewById(R.id.inputEmail);
        EditText inputName = findViewById(R.id.inputName);


        btn.setOnClickListener(view -> {
            Intent intent = new Intent(this, SecondActivity.class);

            intent.putExtra("EMAIL", inputEmail.getText().toString());
            intent.putExtra("NAME", inputName.getText().toString());

            startActivity(intent);
        });
    }
}

package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class startingActivity extends AppCompatActivity {

    Button randome,aichat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);
        randome = findViewById(R.id.Random);
        aichat = findViewById(R.id.aichat);


        randome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                OpenrandomRecipes();
            }
        });

        aichat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Openaichat();
            }
        });
    }

    private void OpenrandomRecipes() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    private void Openaichat() {
        Intent intent = new Intent(this,chatgpt.class);
        startActivity(intent);
    }
}
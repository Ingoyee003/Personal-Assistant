package com.example.personalassisstant;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Splash extends AppCompatActivity {

    Button btn1,btn2,btn3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);

        btn1 = findViewById(R.id.button);
        btn1.setOnClickListener(v -> {
            Intent intent = new Intent(Splash.this, ButtonActivity.class);
            startActivity(intent);
        });

        btn2 = findViewById(R.id.buttonReg);
        btn2.setOnClickListener(v -> {
            Intent intent = new Intent(Splash.this, LoginActivity.class);
            startActivity(intent);
        });

        btn2 = findViewById(R.id.buttonReg2);
        btn2.setOnClickListener(v -> {
            Intent intent = new Intent(Splash.this, Registration.class);
            startActivity(intent);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
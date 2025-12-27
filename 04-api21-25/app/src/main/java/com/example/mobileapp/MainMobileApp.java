package com.example.mobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainMobileApp extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_entry);

        Button buttonFastColor = findViewById(R.id.button_fast_color);
        buttonFastColor.setOnClickListener(v -> openFastColorActivity());

    }

    private void openFastColorActivity(){
        Intent intent = new Intent(MainMobileApp.this, FastColorActivity.class);
        startActivity(intent);
    }
}

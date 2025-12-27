package com.example.color_click;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Color_Click extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.color_click);
        Button btnFastColor = findViewById(R.id.button_fast_color);
        btnFastColor.setOnClickListener(view -> openFastColor());
    }
    private void openFastColor(){
        Intent intent = new Intent(Color_Click.this,Fast_Color.class);
        startActivity(intent);
    }
}

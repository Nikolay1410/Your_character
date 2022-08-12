package com.example.yourcharacter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        TextView textViewDescriptionTemp = findViewById(R.id.textViewDescriptionTemp);
        Intent intent = getIntent();
        if (intent.hasExtra("desc")){
            String description = intent.getStringExtra("desc");
            if (description!=null && !description.isEmpty()) {
                textViewDescriptionTemp.setText(description);
            }
        }
    }
    public void onClickTitle(View view) {
        Intent intentTitle = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intentTitle);
    }
}
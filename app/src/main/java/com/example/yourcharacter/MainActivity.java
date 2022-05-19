package com.example.yourcharacter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Guideline;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerColor;
    private TextView descriptionTemp;
    private Guideline guideline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Assigning elements
        spinnerColor = findViewById(R.id.spinnerColor);
        descriptionTemp = findViewById(R.id.textViewDescriptionTemp);
        guideline = findViewById(R.id.guideline);
    }

    public void showDescription(View view) {
        //Get the position of an element
        int position = spinnerColor.getSelectedItemPosition();
        String description = getDescriptionByPosition(position);
        if (description!=null && !description.isEmpty()) {
            guideline.setGuidelinePercent(0);
            descriptionTemp.setText(description);
        }
    }
    //Element declaration method
    private String getDescriptionByPosition(int position){
        String[] descriptions = getResources().getStringArray(R.array.color_description);
        return descriptions[position];
    }

}
package com.example.yourcharacter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Assigning elements
        spinnerColor = findViewById(R.id.spinnerColor);
        TextView textViewTitle = findViewById(R.id.textViewTitle);
        String title = "Чаще всего люди отдают предпочтение одному цвету. Вопрос \"Какой твой любимый цвет?\" является одним из самых распространенных. Несмотря на то, что в течение жизни пристрастие к цвету у человека может меняться, все же его любимый цвет может многое рассказать о его характере и эмоциональном складе личности.\n" +
                "\n" +
                "Прежде чем выбрать, подумайте, какой цвет ваш любимый ?";
        textViewTitle.setText(title);
    }
    public void onClickDesc(View view) {
        int position = spinnerColor.getSelectedItemPosition();
        String[] descriptions = getResources().getStringArray(R.array.color_description);
        Intent intent = new Intent(getApplicationContext(), DescriptionActivity.class);
        Log.i("kkk", descriptions[position]);

        intent.putExtra("desc", descriptions[position]);
        startActivity(intent);
    }
}
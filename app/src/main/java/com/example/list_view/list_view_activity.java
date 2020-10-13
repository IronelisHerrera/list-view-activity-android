package com.example.list_view;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class list_view_activity extends AppCompatActivity {

    //TextView sport_string_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_activity);

        Intent get_sport_intent = getIntent();
        String sport_string = get_sport_intent.getStringExtra(MainActivity.SPORT_STRING);
        TextView sport_string_id = findViewById(R.id.click_sport_text);
        sport_string_id.setText("Usted ha elegido:"+" "+sport_string);


    }

}
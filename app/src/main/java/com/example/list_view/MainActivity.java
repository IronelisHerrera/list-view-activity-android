package com.example.list_view;

import android.content.Intent;
import android.media.session.MediaController;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //private TextView tv_id;
     ListView lv_id;
    public static final String SPORT_STRING = "sport";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_id = findViewById(R.id.lv_id);
       // tv_id = findViewById(R.id.click_sport_text);
        final String[] sports = new String[]{"Boxeo", "Arco y flecha", "Baloncesto", "Natación", "Polo acuático", "Carreras rápidas", "Ajedrez", "Ciclismo"};
        final ArrayAdapter<String> list_view_adapter = new ArrayAdapter<>(this, R.layout.activity_list_view_activity, R.id.click_sport_text, sports);
        lv_id.setAdapter(list_view_adapter);

        lv_id.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent sports_intent = new Intent(MainActivity.this, list_view_activity.class);
                String current_sport= ((TextView)view).getText().toString();
                sports_intent.putExtra(SPORT_STRING, current_sport );
                startActivity(sports_intent);

            }
        });
    }


}
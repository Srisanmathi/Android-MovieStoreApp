package com.example.hw04_movieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bt_add;
    private Button bt_edit;
    private Button bt_delete;
    private Button bt_year;
    private Button bt_rating;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("My favourite Movies");

        bt_add = findViewById(R.id.bt_add);
        bt_edit = findViewById(R.id.bt_edit);
        bt_delete = findViewById(R.id.bt_delete);
        bt_year = findViewById(R.id.bt_year);
        bt_rating = findViewById(R.id.bt_rating);

    }
}

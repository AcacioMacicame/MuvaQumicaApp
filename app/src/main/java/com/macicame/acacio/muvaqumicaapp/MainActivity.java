package com.macicame.acacio.muvaqumicaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.macicame.acacio.muvaqumicaapp.grade10.Grade10Level1Activity;
import com.macicame.acacio.muvaqumicaapp.grade11.Grade11Level1Activity;
import com.macicame.acacio.muvaqumicaapp.grade12.Grade12Level1Activity;

public class MainActivity extends AppCompatActivity {

    Controller controller = new Controller();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller.initQuestions(getApplicationContext());
    }

    public void onGrade10Click(View view) {
        Intent intent = new Intent(MainActivity.this, Grade10Level1Activity.class);
        startActivity(intent);
    }

    public void onGrade11Click(View view) {
        Intent intent = new Intent(MainActivity.this, Grade11Level1Activity.class);
        startActivity(intent);
    }

    public void onGrade12Click(View view) {
        Intent intent = new Intent(MainActivity.this, Grade12Level1Activity.class);
        startActivity(intent);
    }
}

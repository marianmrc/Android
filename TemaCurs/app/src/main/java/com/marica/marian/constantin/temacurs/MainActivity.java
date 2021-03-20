package com.marica.marian.constantin.temacurs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StartSecond(View view) {
        Intent secondIntent = new Intent(MainActivity.this, Second.class);
        startActivity(secondIntent);
    }
}
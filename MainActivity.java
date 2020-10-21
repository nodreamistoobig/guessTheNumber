package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText minT, maxT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        minT = findViewById(R.id.min);
        maxT = findViewById(R.id.max);
    }

    public void onClick(View v){

        String start = minT.getText().toString();
        String end = maxT.getText().toString();
        int min = Integer.parseInt(start);
        int max = Integer.parseInt(end);

        if (min<=max){
            Intent i = new Intent(MainActivity.this, GuessActivity.class);
            i.putExtra("min", min);
            i.putExtra("max", max);
            startActivity(i);
        }
    }
}
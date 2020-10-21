package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GuessActivity extends AppCompatActivity {
    int min, max, middle;
    TextView result, msg;
    boolean guessed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess);

        result = findViewById(R.id.result);
        msg = findViewById(R.id.msg);

        Intent i = getIntent();
        min = i.getIntExtra("min", 0);
        max = i.getIntExtra("max", 0);

        middle = (min+max)/2;
        String r = String.valueOf(middle);
        result.setText(r);
    }

    public void onClick (View v){
        int id = v.getId();
        if (min!=max){
            if (id == R.id.yes){
                min = middle+1;
            }
            else{
                max = middle;
            }
        }
        else{
            if (guessed)
                finish();
            else {
                msg.setText("Загаданное вами число");
                guessed = true;
            }
        }

        middle = (min+max)/2;
        String r = String.valueOf(middle);
        result.setText(r);
    }
}
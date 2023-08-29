package com.example.counter_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView counterText;
Button btn1, btn5;
int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterText = findViewById(R.id.textView);
        btn1 = findViewById(R.id.button);
        btn5 = findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterText.setText(""+increaseCountBy1());
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterText.setText(""+increaseCountBy5());
            }
        });

    }

    public int increaseCountBy1(){
        return ++count;
    }

    public int increaseCountBy5(){
        return count += 5;
    }
}
package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int ButtonPushedTimes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        final TextView text = findViewById(R.id.text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ButtonPushedTimes++;
                text.setText("Button pressed: " + ButtonPushedTimes + " times");
            }
        });

        final ImageView imgview = findViewById(R.id.imageView);
        imgview.setImageResource(R.drawable.android_logo);
        Switch sw1 = findViewById(R.id.switch1);
        sw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (imgview.getVisibility() == View.VISIBLE) {
                    imgview.setVisibility(View.INVISIBLE);
                } else {
                    imgview.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}

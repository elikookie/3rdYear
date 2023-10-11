package com.example.lab3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int numClicks = 0;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView counter = findViewById(R.id.counter);

        counter.setText("Number of clicks: " + numClicks);
    }

    public void buttonA(View view) {
        numClicks++;
        updateCounter();
        Toast.makeText(this, "You just clicked button A", Toast.LENGTH_SHORT).show();
    }

    public void buttonB(View view) {
        numClicks--;
        updateCounter();
        Toast.makeText(this, "You just clicked button B", Toast.LENGTH_SHORT).show();
    }

    @SuppressLint("SetTextI18n")
    private void updateCounter(){
        TextView counter = findViewById(R.id.counter);

        counter.setText("Number of clicks: " + numClicks);
    }
}
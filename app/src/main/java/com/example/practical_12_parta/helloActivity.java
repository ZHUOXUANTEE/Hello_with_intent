package com.example.practical_12_parta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class helloActivity extends AppCompatActivity {

    private TextView count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        count = findViewById(R.id.count);

        Intent intent = getIntent();


        count.setText(intent.getStringExtra("count").toString()) ;

    }
}

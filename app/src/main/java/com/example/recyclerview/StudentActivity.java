package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class StudentActivity extends AppCompatActivity {

    TextView name, level, stdNo, avg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);


        name = findViewById(R.id.name);
        level = findViewById(R.id.level);
        stdNo = findViewById(R.id.std_no);
        avg = findViewById(R.id.avg);

        Intent intent = getIntent();
        name.setText(intent.getStringExtra("name"));
        level.setText(intent.getStringExtra("level"));
        stdNo.setText(intent.getStringExtra("stdNo"));
        avg.setText(intent.getStringExtra("avg"));


    }
}

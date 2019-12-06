package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView studentsRecyclerView;
    private StudentAdapter studentAdapter;

    private List<Student> studentsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        studentsRecyclerView = findViewById(R.id.students_recycler_view);
        studentsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        studentAdapter = new StudentAdapter(this, studentsList);
        studentsRecyclerView.setAdapter(studentAdapter);

    }

    private void initData() {
        studentsList.add(new Student("Yahia", "2015XXXX", "5", 90));
        studentsList.add(new Student("Mohammed", "2015XXXX", "5", 90));
        studentsList.add(new Student("Nizar", "2015XXXX", "5", 90));
        studentsList.add(new Student("Iyad", "2014XXXX", "5", 90));
        studentsList.add(new Student("Hussin", "2015XXXX", "5", 90));
}}

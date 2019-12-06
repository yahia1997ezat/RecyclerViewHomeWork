package com.example.recyclerview;

public class Student {
    private String name, stdNo, level;
    private float avg;

    public Student(String name, String stdNo, String level, float avg) {
        this.name = name;
        this.stdNo = stdNo;
        this.level = level;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStdNo() {
        return stdNo;
    }

    public void setStdNo(String stdNo) {
        this.stdNo = stdNo;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }
}

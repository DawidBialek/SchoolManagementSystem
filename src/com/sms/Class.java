package com.sms;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Class {

    private static final AtomicInteger count = new AtomicInteger(0);
    private int classId;
    private ArrayList<Integer> grades = new ArrayList<Integer>();

    public Class(ArrayList<Integer> grades) {
        this.classId = count.incrementAndGet();
        this.grades = grades;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    @Override
    public String toString() {
        return "Class{" +
                "classId=" + classId +
                ", grades=" + grades +
                '}';
    }
}

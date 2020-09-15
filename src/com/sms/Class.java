package com.sms;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Class {

    private static final AtomicInteger count = new AtomicInteger(0);
    int classId;
    ArrayList<Integer> grades = new ArrayList<Integer>();

    public Class(int classId, ArrayList<Integer> grades) {
        this.classId = count.incrementAndGet();
        this.grades = grades;
    }
}

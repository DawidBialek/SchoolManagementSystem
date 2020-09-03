package com.sms;

import java.util.concurrent.atomic.AtomicInteger;

public class Student {

    private int id;
    private static final AtomicInteger count = new AtomicInteger(0);
    private String name;
    private int grade;
    private int feesPaid;
    private int semesterCost;

    public Student(int id, String name, int grade){
        this.id = count.incrementAndGet();
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.semesterCost = 30000;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public void payFees(int fees, School school){
        this.feesPaid += fees;
        school.updateTotalMoneyEarned(fees);

    }

    public int getId(){
        return id;
    }

    public int getGrade(){
        return grade;
    }

    public int getFeesPaid(){
        return feesPaid;
    }

    public int getFeesTotal(){
        return semesterCost;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", feesPaid=" + feesPaid +
                ", feesTotal=" + semesterCost +
                '}';
    }
}

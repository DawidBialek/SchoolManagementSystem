package com.sms;

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;

        this.feesPaid = 0;
        this.feesTotal = 30000;
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
        return feesTotal;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", feesPaid=" + feesPaid +
                ", feesTotal=" + feesTotal +
                '}';
    }
}

package com.sms;

import java.util.concurrent.atomic.AtomicInteger;

public class  Teacher {

    private int id;
    private static final AtomicInteger count = new AtomicInteger(0);
    private String name;
    private int salary;
    private int currentCashAmount;

    public Teacher(int id, String name, int salary){
        this.id = count.incrementAndGet();
        this.name = name;
        this.salary = salary;
        this.currentCashAmount = 0;
    }


    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    public void recieveSalary(School school){
        currentCashAmount += salary;
        school.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", salaryEarned=" + currentCashAmount +
                '}';
    }
}

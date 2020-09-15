package com.sms;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Teacher Janusz = new Teacher(1, "Janusz", 500);
        Teacher Tomasz = new Teacher(2, "Tomasz", 1000);
        Teacher Irena = new Teacher(3, "Irena", 1200);

        Student Michal = new Student(1, "Michal", 4);
        Student Adam = new Student(2, "Adam", 3);
        Student Weronika = new Student(3, "Weronika", 5);

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(Janusz);
        teachers.add(Tomasz);
        teachers.add(Irena);

        ArrayList<Student> students = new ArrayList<>();
        students.add(Michal);
        students.add(Adam);
        students.add(Weronika);

        School school = new School(teachers, students);

        school.addTeacher(new Teacher(4, "Megan", 1000));

//        System.out.println("School has earned : " + school.getTotalMoneyEarned() + "$");
//        System.out.println("School has : " + school.getBankAccount() + "$ on bank account");

        Michal.payFees(3000, school);
//        System.out.println("School has earned : " + school.getTotalMoneyEarned() + "$");
//        System.out.println("After paying fees school has : " + school.getBankAccount() + "$ on bank account");

        Janusz.receiveSalary(school);
//        System.out.println("School has spent : " + school.getTotalMoneySpent() + "$");
//        System.out.println("School has earned : " + school.getTotalMoneyEarned() + "$");
//        System.out.println("After receiving salary school has : " + school.getBankAccount() + "$ on bank account");

//        System.out.println(Janusz);
//        System.out.println(Michal);
//
//        System.out.println(school);

        SystemManager systemManager = new SystemManager(school);

        systemManager.run();
    }
}

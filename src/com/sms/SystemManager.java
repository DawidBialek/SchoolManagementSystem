package com.sms;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class SystemManager {

    int option;
    private Scanner scanner = new Scanner(System.in);
    private School school;

    public SystemManager(School school){
        this.school = school;
    }


    private void studentsMenu(){
        System.out.println("\nStudent options:");
        System.out.println("[0] - Print students info");
        System.out.println("[1] - Add chosen student payment");

        System.out.print("Input option here: ");

        option = scanner.nextInt();
        System.out.println("You choose option " + option);

        if(option == 0){
            System.out.println(school.getStudents());
        } else if(option == 1){
            int payment;
            int studentId;
            String studentName;
            System.out.print("Amount of payment: ");
            payment = scanner.nextInt();
            System.out.print("Student id: ");
            studentId = scanner.nextInt();
            school.getStudents().get(studentId).payFees(payment, school);
            System.out.println("Successfully payed for the student " + studentId);
            System.out.println("Current student payment amount: " + school.getStudents().get(studentId).getFeesPaid() + " out of " + school.getStudents().get(studentId).getFeesTotal());
            System.out.println("Amount of money to pay: " + (school.getStudents().get(studentId).getFeesTotal() - school.getStudents().get(studentId).getFeesPaid()));
        }
    }

    public void teachersMenu(){
        System.out.println("\nTeacher options:");
        System.out.println("[0] - Print teachers info");
        System.out.println("[1] - Set payday for all teachers");
        System.out.println("[2] - Send payment for chosen teacher");

        System.out.print("Input option here: ");

        option = scanner.nextInt();
        System.out.println("You choose option " + option);
    }

    public void classesAndGradesMenu(){
        System.out.println("\nClasses and grades options:");
        System.out.println("[0] - Add new class");
        System.out.println("[1] - Add new grade for chosen student");
        System.out.println("[2] - Print chosen class info");

        System.out.print("Input option here: ");

        option = scanner.nextInt();
        System.out.println("You choose option " + option);
    }

    public void run(){

        System.out.println("Welcome to the School Management system version 0.0.1");
        System.out.println("Loading...");
        try {
            sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while(true){
            System.out.println("\nMain menu options:");
            System.out.println("[0] - Students");
            System.out.println("[1] - Teachers");
            System.out.println("[2] - Classes and grades");

            System.out.print("Input option here: ");

            option = scanner.nextInt();
            System.out.println("You choose option " + option);

            if(option == 0){
                studentsMenu();
            } else if(option == 1){
                teachersMenu();
            } else if(option == 2){
                classesAndGradesMenu();
            }
        }
    }
}

package com.sms;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class SystemManager {

    int option;
    Scanner scanner = new Scanner(System.in);


    private void studentsMenu(){
        System.out.println("\nStudent optoins:");
        System.out.println("[0] - Print students info");
        System.out.println("[1] - Print chosen student info");
        System.out.println("[2] - Add students payment");
        System.out.println("[3] - Add chosen student payment");

        System.out.print("Input option here: ");

        option = scanner.nextInt();
        System.out.println("You choose option " + option);
    }

    public void teachersMenu(){
        System.out.println("\nTeacher optoins:");
        System.out.println("[0] - Print teachers info");
        System.out.println("[1] - Print chosen teacher info");
        System.out.println("[2] - Set payday for all teachers");
        System.out.println("[3] - Send payment for chosen teacher");

        System.out.print("Input option here: ");

        option = scanner.nextInt();
        System.out.println("You choose option " + option);
    }

    public void classesAndGradesMenu(){
        System.out.println("\nClasses and grades optoins:");
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
            System.out.println("\nAvalible optoins:");
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

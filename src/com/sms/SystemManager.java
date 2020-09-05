package com.sms;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class SystemManager {

    int option;
    Scanner scanner = new Scanner(System.in);

    public void run(){

        System.out.println("Welcome to the School Management system version 0.0.1");
        System.out.println("Loading...");
        try {
            sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while(true){
            System.out.println("\n\nAvalible optoins:");
            System.out.println("[0] - School");
            System.out.println("[1] - Students");
            System.out.println("[2] - Teachers");
            System.out.println("[3] - Classes and grades");

            System.out.println("Input option here: ");

            option = scanner.nextInt();
            System.out.println("You choose option " + option);
        }
    }
}

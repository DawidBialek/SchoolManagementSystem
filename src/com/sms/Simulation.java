package com.sms;

import java.time.LocalDate;
import java.util.Scanner;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class Simulation implements Runnable{

    private LocalDate simulatedDate;
    private Scanner scanner = new Scanner(System.in);
    private School school;
    private KeyListener keyListener;
    private final Object pauseLock = new Object();

    public Simulation(School school, KeyListener keyListener){
        this.school = school;
        this.keyListener = keyListener;
    }

    public void run(){
        simulatedDate = LocalDate.now(); // Create a date object
        System.out.println(simulatedDate); // Display the current date

        long start = System.nanoTime();
        while(true){

            try{
                sleep(200);
            } catch (Exception e){

            }

            if(keyListener.getIsKeyPressed().get() == true){
                keyListener.getIsKeyPressed().set(false);
//                try {
//                    Thread.currentThread().wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                break;
            }

            long end = System.nanoTime();
            if((end - start)/1000000 > 500){
                simulatedDate = simulatedDate.plusDays(1);
                start = System.nanoTime();
                System.out.println(simulatedDate);

            } else if(simulatedDate.getDayOfMonth() == school.getSalaryDay().getDayOfMonth()){
                for (Teacher teacher : school.getTeachers()
                     ) {
                    teacher.receiveSalary(school);
                }
                simulatedDate = simulatedDate.plusDays(1);
                start = System.nanoTime();
                System.out.println(simulatedDate);
            } else if(simulatedDate.getDayOfMonth() == school.getStudentPaymentDate().getDayOfMonth()){
                for (Student student : school.getStudents()
                ) {
                    if(student.getFeesPaid() != student.getFeesTotal()){
                        System.out.println("Student " + student.getId() + " is required to send fee of " + (student.getFeesTotal() - student.getFeesPaid()));
                    }
                }
                simulatedDate = simulatedDate.plusDays(1);
                start = System.nanoTime();
                System.out.println(simulatedDate);
            }
        }
    }
}

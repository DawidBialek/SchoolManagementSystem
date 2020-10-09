package com.sms;

import java.time.LocalDate;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Simulation {

    private LocalDate simulatedDate;
    private Scanner scanner = new Scanner(System.in);
    private School school;

    public Simulation(School school){
        this.school = school;
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

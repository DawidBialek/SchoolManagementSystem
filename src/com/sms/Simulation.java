package com.sms;

import java.time.LocalDate;

import static java.lang.Thread.sleep;

public class Simulation {

    private LocalDate simulatedDate;

    public void run(){
        simulatedDate = LocalDate.now(); // Create a date object
        System.out.println(simulatedDate); // Display the current date

        simulatedDate = simulatedDate.plusDays(1);

        long start = System.nanoTime();
        while(true){
            try{
                sleep(100);
            } catch (Exception e){

            }
            long end = System.nanoTime();
//            System.out.println("Elapsed time: " + ((end - start)/1000000) + "ms");


            if((end - start)/1000000 > 500){
                simulatedDate = simulatedDate.plusDays(1);
                start = System.nanoTime();

                System.out.println(simulatedDate);
            }
        }
    }
}

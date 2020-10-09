package com.sms;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class KeyListener implements Runnable{

    private Scanner scanner;
    private AtomicBoolean isKeyPressed;

    public KeyListener(){
        this.scanner = new Scanner(System.in);
        isKeyPressed = new AtomicBoolean(false);
    }


    public void run(){
        while(true){
            if(scanner.hasNext()){
                isKeyPressed.set(true);
            }
        }
    }

    public AtomicBoolean getIsKeyPressed() {
        return isKeyPressed;
    }

    public void setIsKeyPressed(AtomicBoolean isKeyPressed) {
        this.isKeyPressed = isKeyPressed;
    }
}

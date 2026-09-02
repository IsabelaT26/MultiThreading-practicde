package org.example;

public class T1 extends Thread {


    public T1() {
        start();
    }

    public void run() {
        while(true) {
            System.out.println("In run");
        }
    }

}

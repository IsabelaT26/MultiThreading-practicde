package org.example;

public class T1 extends Thread {


    public T1() {
        start();
    }

    @Override
    public void run() {
        int counter = 0;
        while (counter < 10) {
            System.out.println("STDOUT");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }

            counter++;
        }
    }

}

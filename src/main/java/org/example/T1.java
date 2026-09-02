package org.example;

public class T1 extends Thread {

    @Override
    public void run() {

        while (true) {
            System.out.println("Tråd 1");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

}

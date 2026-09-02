package org.example;

public class T2 implements Runnable{

    @Override
    public void run() {
        while (true) {

            System.out.println("Tråd 2");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }


}

package org.example;

public class T2 implements Runnable{

    Thread t = new Thread(this);

    public T2() {
        t.start();
    }

    @Override
    public void run() {
        int count = 0;
        while (count < 10){
            System.out.println("T2");
            count++;
        }
    }


}

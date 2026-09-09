package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(){

        T1 t1 = new T1();
        t1.start();

        wait5Seconds();

        T2 task = new T2();
        Thread t2 = new Thread(task);
        t2.start();


        wait5Seconds();

        task.pause();

        wait5Seconds();

        task.resume();

        wait5Seconds();

        t1.interrupt();

        wait5Seconds();

        t2.interrupt();

    }

    public static void wait5Seconds(){
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("Thread interrupted");
        }
    }
}

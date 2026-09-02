package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws InterruptedException {

        Thread t1 = new T1();
        t1.start();
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("Thread interrupted");
        }

        Thread t2 = new Thread();
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("Thread interrupted");
        }



    }
}

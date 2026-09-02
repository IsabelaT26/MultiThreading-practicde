package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(){

        Thread t1 = new T1();
        T2 t2 = new T2();
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("Thread interrupted");
        }



//        try {
//            Thread.sleep(5000);
//        }catch (InterruptedException e){
//            System.out.println("Thread interrupted");
//        }



    }
}

package org.example;

public class T2 implements Runnable{

    private boolean paused = false;


    @Override
    public void run() {
        while (true) {

            synchronized (this) {
                while (paused) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        return;
                    }
                }
            }

            System.out.println("Tråd 2");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public void pause(){
        synchronized (this) {
            paused = true;
        }
    }

    public void resume(){
        synchronized (this) {
            paused = false;
            notify();
        }
    }


}

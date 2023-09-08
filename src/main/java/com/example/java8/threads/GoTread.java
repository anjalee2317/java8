package com.example.java8.threads;

public class GoTread extends Thread {
    @Override
    public void run() {
        System.out.println("Starting Thread : " + Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            System.out.println("Go");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Completed Thread : " + Thread.currentThread().getName());

    }
}

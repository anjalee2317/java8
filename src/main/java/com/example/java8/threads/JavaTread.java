package com.example.java8.threads;

public class JavaTread extends Thread {

    @Override
    public void run() {
        System.out.println("Starting Thread : " + Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            System.out.println("Java");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Completed Thread : " + Thread.currentThread().getName());

    }
}

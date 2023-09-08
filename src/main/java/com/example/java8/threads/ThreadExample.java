package com.example.java8.threads;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Starting Thread : " + Thread.currentThread().getName());

        new Thread(() -> {
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

        }, "Java T").start();

        new Thread(() -> {
            System.out.println("Starting Thread : " + Thread.currentThread().getName());

            for (int i = 0; i < 10; i++) {
                System.out.println("Python");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Completed Thread : " + Thread.currentThread().getName());

        }, "Python T").start();

        new Thread(() -> {
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

        }, "Go T").start();

        System.out.println("Completed Thread : " + Thread.currentThread().getName());

    }

}

package com.example.java8.designPattern;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {

        if (instance == null) {

            synchronized (Singleton.class) {

                if (instance == null) {

                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println("First time : " + Singleton.getInstance());
        System.out.println("Second time : " + Singleton.getInstance());
    }
}

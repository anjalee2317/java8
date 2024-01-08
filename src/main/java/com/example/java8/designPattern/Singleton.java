package com.example.java8.designPattern;

public class Singleton {
    // ensure visibility in multi-threaded environment
    private static volatile Singleton instance;

    // private constructor to prevent instantiation from outside
    private Singleton() {
    }

    // public method to get Singleton instance
    public static Singleton getInstance() {

        // Double check locks
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    // create the instance if it's null
                    // lazy initialization to avoid unnecessary resource consumption
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

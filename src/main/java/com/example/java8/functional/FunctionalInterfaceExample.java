package com.example.java8.functional;

@FunctionalInterface
public interface FunctionalInterfaceExample {
    void print(String msg);

    default void method1(){
        System.out.println("Default method");
    }

    static void method2(){
        System.out.println("Static method");
    }
}

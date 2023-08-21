package com.example.java8.methodRef;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;


interface Printable {
    void print(String msg);
}

public class MethodReferenceExample {

    public static int addition(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {

        // 1. Static method example
        // lambda exp
        Function<Integer, Double> function = (input) -> Math.sqrt(input);
        System.out.println(function.apply(4));

        // method ref
        Function<Integer, Double> functionMethodRef = Math::sqrt;
        System.out.println(function.apply(4));

        // lambda exp
        BiFunction<Integer, Integer, Integer> biFunctionLambda = (a, b) -> MethodReferenceExample.addition(a, b);
        System.out.println(biFunctionLambda.apply(10, 20));

        // method ref
        BiFunction<Integer, Integer, Integer> biFunction = MethodReferenceExample::addition;
        System.out.println(biFunction.apply(10, 20));

        // 2. Instance method example
        MethodReferenceExample methodReferenceExample = new MethodReferenceExample();

        // lambda exp
        Printable printableLambda = (msg) -> methodReferenceExample.display(msg);
        printableLambda.print("Hello");

        // method ref
        Printable printable = methodReferenceExample::display;
        printable.print("World");

        // 3. Reference to a instance method of an arbitrary object
        // lambda exp
        Function<String, String> stringFunctionLambda = (input) -> input.toLowerCase();
        System.out.println(stringFunctionLambda.apply("Java Guides"));

        // method ref
        Function<String, String> stringFunction = String::toLowerCase;
        System.out.println(stringFunction.apply("Java Demo"));

        String[] strArray = {"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"};

        // lambda exp
        Arrays.sort(strArray, (s1, s2) -> s1.compareToIgnoreCase(s2));

        // method ref
        Arrays.sort(strArray, String::compareToIgnoreCase);

        // 4. Reference to a constructor
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Lemon");

        // lambda exp
        Function<List<String>, Set<String>> setFunctionLambda = (fruitsList) -> new HashSet<>(fruitsList);
        System.out.println(setFunctionLambda.apply(fruits));

        // method ref
        Function<List<String>, Set<String>> setFunction = HashSet::new;
        System.out.println(setFunction.apply(fruits));

    }

    public void display(String msg) {
        msg = msg.toUpperCase();
        System.out.println(msg);
    }
}

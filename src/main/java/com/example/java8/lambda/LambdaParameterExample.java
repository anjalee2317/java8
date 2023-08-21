package com.example.java8.lambda;


interface Addable {
    int addition(int a, int b);
}

class AddableImpl implements Addable {

    @Override
    public int addition(int a, int b) {
        System.out.println("Addition a & b");
        return a + b;
    }
}

public class LambdaParameterExample {
    public LambdaParameterExample() {
        Addable addable = (a, b) -> a + b;
        int result = addable.addition(10,20);
        System.out.println("Addition a & b = " + result);
    }
}

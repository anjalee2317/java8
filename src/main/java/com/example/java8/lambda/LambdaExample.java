package com.example.java8.lambda;


interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square");
    }
}

public class LambdaExample {
    public LambdaExample() {
        Shape shapeCircle = () -> System.out.println("Circle draw method");
//        shapeCircle.draw();

        print(shapeCircle);
        print(() -> System.out.println("Square draw method"));
    }

    private static void print(Shape shape) {
        shape.draw();
    }
}

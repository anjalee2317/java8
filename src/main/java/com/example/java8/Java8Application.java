package com.example.java8;

import com.example.java8.lambda.LambdaParameterExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java8Application {

    public static void main(String[] args) {
        SpringApplication.run(Java8Application.class, args);
//        new LambdaExample();
        new LambdaParameterExample();
    }

}

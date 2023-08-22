package com.example.java8.streams;

import java.util.*;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        // create a stream
        Stream<String> stringStream = Stream.of("a", "b", "c");
        stringStream.forEach(System.out::println);

        // Stream from collection
        Collection<String> collection = Arrays.asList("Java", "J2EE", "Spring");
        Stream<String> stream = collection.stream();
        stream.forEach(System.out::println);

        List<String> list = Arrays.asList("Java", "J2EE", "Spring");
        Stream<String> streamList = list.stream();
        streamList.forEach(System.out::println);

        Set<String> set = new HashSet<>(list);
        Stream<String> streamSet = set.stream();
        streamSet.forEach(System.out::println);

        String[] strArray = {"a", "b", "c"};
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(System.out::println);

    }
}

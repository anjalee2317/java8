package com.example.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamFindElementsExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        // findFirst(), findAny()
        Optional<Integer> optionalElement = list.stream().findFirst();
        if (optionalElement.isPresent()) {
            System.out.println(optionalElement.get());
        } else {
            System.out.println("Stream is empty");
        }

        Optional<Integer> anyElement = list.stream().findAny();
        if (anyElement.isPresent()) {
            System.out.println(anyElement.get());
        } else {
            System.out.println("Stream is empty");
        }

        // count(), min(), max()
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Count = " + stream.count());

        Integer minElement = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min = " + minElement);

        Integer maxElement = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max = " + maxElement);
    }
}

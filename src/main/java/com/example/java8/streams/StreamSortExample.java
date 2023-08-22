package com.example.java8.streams;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortExample {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<String>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        // Ascending order
        List<String> sortedList = fruits.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(sortedList);

        List<String> sortedList1 = fruits.stream()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .collect(Collectors.toList());
        System.out.println(sortedList1);

        List<String> sortedList2 = fruits.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList2);

        // Descending order
        List<String> sortedList3 = fruits.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedList3);

        List<String> sortedList4 = fruits.stream()
                .sorted((o1, o2) -> o2.compareTo(o1))
                .collect(Collectors.toList());
        System.out.println(sortedList4);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10, "Emma", 100000));
        employees.add(new Employee(20, "Anna", 200000));
        employees.add(new Employee(10, "John", 150000));
        employees.add(new Employee(10, "Sam", 300000));

        List<Employee> employeesSortedList = employees.stream()
                .sorted(((o1, o2) -> o1.getSalary() - o2.getSalary()))
                .collect(Collectors.toList());
        System.out.println(employeesSortedList);

        employees.stream()
                .sorted(((o1, o2) -> o2.getSalary() - o1.getSalary()))
                .forEach(System.out::println);

        List<Employee> employeesSortedList1 = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        System.out.println(employeesSortedList1);

    }
}


@Data
@AllArgsConstructor
class Employee {
    private int id;
    private String name;
    private int salary;
}

package com.example.java8.collection;

import java.util.*;

public class HashSetExample {

    public static void main(String[] args) {

        // Use Set
        Set<String> elements = new HashSet<>();
        // Use List
        // List<String> elements = new ArrayList<>();
        // contain one null value
        elements.add(null);
        elements.add(null);
        System.out.println(elements);

        // not allow duplicates
        elements.add("Element");
        elements.add("Element");
        System.out.println(elements);

        // unordered collection
        elements.add("Element1");
        elements.add("Element2");
        elements.add("Element3");
        elements.add("Element4");
        System.out.println(elements);

        // use another collection to create new Hash set
        Set<String> hashSet = new HashSet<>(elements);

        System.out.println(hashSet);

        Set<String> elementSet = new HashSet<>();
        elementSet.add("Apple");
        elementSet.add("Banana");
        elementSet.add("Orange");

        List<String> elementList = new ArrayList<>();
        elementList.add("John");
        elementList.add("Anne");
        elementList.add("Emma");

        // addAll()
        hashSet.addAll(elementSet);
        hashSet.addAll(elementList);
        System.out.println(hashSet);

        // remove(), removeAll(), clear()
        hashSet.remove(null);
        hashSet.remove("Emma");
        System.out.println(hashSet);

        hashSet.removeAll(elementSet);
        System.out.println(hashSet);

        hashSet.clear();
        System.out.println(hashSet);

        System.out.println("___________________________");

        // forEach(), stream() + forEach() + lambda
        elementSet.forEach(System.out::println);
        System.out.println("___________________________");
        elementSet.stream()
                .filter(set -> !set.equals("Apple"))
                .forEach(set -> System.out.println(set));
        System.out.println("___________________________");

        // for loop with iterator & enhanced for loop
        for (String fruit: elementSet) {
            System.out.println(fruit);
        }
        System.out.println("___________________________");

        for(Iterator<String> iterator = elementSet.iterator(); iterator.hasNext();) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
        System.out.println("___________________________");

        // while loop
        Iterator<String> iterator = elementSet.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}

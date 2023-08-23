package com.example.java8.collection;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);

        System.out.println(map);

        // add null key & value
        map.put(null, 6);
        map.put(null, 7);
        map.put("Four", null);

        System.out.println(map);

        // check empty(), size()
        System.out.println(map.isEmpty());
        System.out.println(map.size());

        // check for a key
        if (map.containsKey("Four"))
            System.out.println("Exists");

        // check for a value
        if (map.containsValue(null))
            System.out.println("Exists");

        // get value by key
        System.out.println(map.get("One"));

        // remove key value pair
        map.remove("Three");
        System.out.println(map);

        // retrieve only keys/values
        Set<String> keys = map.keySet();
        System.out.println(keys);

        Collection<Integer> values = map.values();
        System.out.println(values);
        
        // Iterate over a HashMap

        // for each ()
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key - " + entry.getKey() + " & Value - " + entry.getValue());
        }

        // Iterator
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key - " + entry.getKey() + " & Value - " + entry.getValue());
        }

        // forEach()
        map.forEach((k, v) -> {
            System.out.println("K - " + k);
            System.out.println("V - " + v);
        });

        // using a user defined object
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, new Student("Anne", "D"));
        studentMap.put(2, new Student("Emma", "S"));
        studentMap.put(3, new Student("John", "W"));

        System.out.println(studentMap.values());
    }
}

@Data
@AllArgsConstructor
class Student {
    private String firstName;
    private String lastName;
}

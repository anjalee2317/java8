package com.example.java8.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListExample {


    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("AA");
        strList.add("AA");
        strList.add("BB");
        strList.add("AA");
        strList.add("EE");
        strList.add("AA");
        strList.add("BB");
        strList.add("EE");
        strList.add("EE");
        strList.add("AA");


        // find repeated strings counts
        Map<String, Integer> repeatedStr = new HashMap<>();
        for (String str : strList) {
            if (!repeatedStr.containsKey(str)) {
                int count = 0;
                for (String s : strList) {
                    if (s.equals(str)) {
                        count++;
                    }
                }
                repeatedStr.put(str, count);
            }
        }
        System.out.println(repeatedStr);
    }
}

package com.example.java8.optional;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        String email = "anjaleesakunthala@gmail.com";
        String name = null;

        // of(), empty(), ofNullable()
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        Optional<String> emailOptional = Optional.of(email);
        System.out.println(emailOptional);

        Optional<String> nameNullable = Optional.ofNullable(name);
        // System.out.println(nameNullable.get());

        // isPresent()
        if(nameNullable.isPresent()){
            System.out.println(nameNullable.get());
        } else {
            System.out.println("No value present");
        }

        // orElse(), orElseGet(), orElseThrow()
        String defaultName = nameNullable.orElse("default name");
        System.out.println(defaultName.toUpperCase());

        String optionalGet = nameNullable.orElseGet(() -> "default name from lambda");
        System.out.println(optionalGet);

        // String nameNotPresent = nameNullable.orElseThrow(() -> new IllegalArgumentException("Name is not present"));
        // System.out.println(nameNotPresent);

        // ifPresent()
        Optional<String> gender = Optional.of("Male");
        Optional<String> emptyObject = Optional.empty();

        gender.ifPresent((s) -> System.out.println("Value present - " + s));
        emptyObject.ifPresent((s) -> System.out.println("No value present"));

        // filter()
        String result = " abc ";
        if (result != null && result.contains("abc")){
            System.out.println(result);
        }

        Optional<String> stringOptional = Optional.of(result);
        stringOptional.filter(res -> res.contains("abc"))
                .ifPresent((res) -> System.out.println(res));

        // map()
        Optional<String> strOpt = Optional.of(result);
        strOpt.filter(res -> res.contains("abc"))
                .map(String::trim)
                .ifPresent((res) -> System.out.println(res.toUpperCase()));

    }
}

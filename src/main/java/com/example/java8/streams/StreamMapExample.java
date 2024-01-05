package com.example.java8.streams;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapExample {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<User>();
        userList.add(new User(1, "Anne", "secret", "anne@gmail.com"));
        userList.add(new User(2, "John", "secret", "john@gmail.com"));
        userList.add(new User(3, "Emma", "secret", "emma@gmail.com"));

        // forEach() with list
        userList.forEach((user -> {
            System.out.println(user.getUserName());
            System.out.println(user.getPassword());
            System.out.println(user.getEmail());
        }));

        // forEach() with stream
        userList.stream()
                .map((User user) -> new UserDTO(user.getId(), user.getUserName(), user.getEmail()))
                .forEach(System.out::println);

        // get usernames to a list
        List<String> nameList = userList.stream().map(User::getUserName).toList();
        System.out.println(nameList);

    }

}


@Data
@AllArgsConstructor
class UserDTO {
    private int id;
    private String userName;
    private String email;
}

@Data
@AllArgsConstructor
class User {
    private int id;
    private String userName;
    private String password;
    private String email;
}

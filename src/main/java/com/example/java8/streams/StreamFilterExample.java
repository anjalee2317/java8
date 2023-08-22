package com.example.java8.streams;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class StreamFilterExample {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<Product>();
        for (Product product : getProducts()) {
            if (product.getPrice() > 20000f) {
                list.add(product);
            }
        }

        for (Product product : list) {
            System.out.println(product);
        }
        System.out.println("*******************");

        // using Stream API
        getProducts().stream()
                .filter((product) -> product.getPrice() > 20000f)
                .forEach(System.out::println);

    }

    private static List<Product> getProducts() {

        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1, "HP", 10000f));
        productList.add(new Product(2, "Dell", 20000f));
        productList.add(new Product(3, "Lenovo", 30000f));
        productList.add(new Product(4, "Apple", 40000f));
        productList.add(new Product(5, "Acer", 25000f));
        return productList;
    }

}

@Data
@AllArgsConstructor
class Product {
    private int id;
    private String name;
    private float price;
}

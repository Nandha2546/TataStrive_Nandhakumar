package day9;

import java.util.Arrays;

public class HappyMart {
    public static void main(String[] args) {
        Product[] products = {
            new Product(2002, "Adapter", 4000),
            new Product(2045, "Mouse", 150),
            new Product(5353, "Laptop", 50000),
            new Product(3423, "Modem", 3400),
            new Product(3555, "Keyboard", 500)
        };

        System.out.println("Original");
        for (Product product : products) {
            System.out.println(product);
        }

        Arrays.sort(products, (p1, p2) -> Integer.compress(p1.price, p2.price));

        System.out.println("\nSorted by price");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
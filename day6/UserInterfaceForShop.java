package day6;

import java.util.Scanner;

public class UserInterfaceForShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Customer Name:");
        String name = sc.nextLine();

        System.out.println("Enter your phone number:");
        long number = sc.nextLong();
        sc.nextLine(); // Consume newline

        System.out.println("Enter your street name:");
        String streetName = sc.nextLine();

        System.out.println("Enter your bill amount:");
        double amount = sc.nextDouble();

        System.out.println("Enter your distance:");
        int distance = sc.nextInt();

        CustomerDetails cd = new CustomerDetails(name, number, streetName, amount, distance);
        System.out.println(cd);

        sc.close();
    }
}

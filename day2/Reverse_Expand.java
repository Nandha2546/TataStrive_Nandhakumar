package day2;

import java.util.Scanner;

public class Reverse_Expand {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        if (number < 1000 || number > 9999) {
            System.out.println("Invalid number");
        } else {
            int reversedNumber = reverseNumber(number);
            expandNumber(reversedNumber);
        }

        sc.close();
    }

    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
        return reversedNumber;
    }

    public static void expandNumber(int number) {
        int thousands = (number / 1000) * 1000;
        int hundreds = ((number / 100) % 10) * 100;
        int tens = ((number / 10) % 10) * 10;
        int ones = (number % 10);

        System.out.println("Reversed number: " + number);
        System.out.println("Expanded number: " + thousands + " + " + hundreds + " + " + tens + " + " + ones);
    }
}

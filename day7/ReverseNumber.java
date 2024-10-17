package day7;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse:");
        int number = sc.nextInt();
        int reversedNumber = 0;

        while(number!=0) {
        	int digits=number%10;
        	reversedNumber=reversedNumber*10+digits;
        	number=number/10;
        }

        System.out.println("Reversed number: " + reversedNumber);
    }
}

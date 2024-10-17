package day7;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to reverse:");
        String original = sc.nextLine();
        String reverse = "";
        int len = original.length();
        
        for (int i = len - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        
        reverse = reverse.toUpperCase();
        System.out.println("Reversed string is " + reverse);
    }
}

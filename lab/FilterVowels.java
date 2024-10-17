package lab;

import java.util.Scanner;

public class FilterVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) == -1) {
                result.append(c);
            }
        }
        System.out.println("String without vowels: " + result.toString());
    }
}


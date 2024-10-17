package lab;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberCheck {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generates a number between 1 and 100
        System.out.print("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        int guessedNumber = sc.nextInt();

        if (guessedNumber == randomNumber) {
            System.out.println("Correct! The number was " + randomNumber);
        } else {
            System.out.println("Incorrect. The number was " + randomNumber);
        }
    }
}


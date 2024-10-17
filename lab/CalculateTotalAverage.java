package lab;

import java.util.Scanner;
public class CalculateTotalAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalMarks = 0;
        int subjects = 5;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int mark = sc.nextInt();
            totalMarks += mark;
        }

        double average = totalMarks / (double) subjects;
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average marks: " + average);
    }
}

package day1;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();
        double bmi = weight / ((height / 100) * (height / 100));
        System.out.printf("Your BMI is %.2f. ", bmi);
        if (bmi >= 25) {
            System.out.println("You are overweight.");
            
            double weightToReduce = bmi - 25 ;
            System.out.printf("Reduce %.2f kg to be fit.\n", weightToReduce);
        } else if (bmi >= 18.5) {
            System.out.println("You are fit and healthy.");
        } else {
            System.out.println("You are underweight.");
           
            double weightToGain = 18.5 - bmi;
            System.out.printf("Gain %.2f kg to be fit.\n", weightToGain);
        }
    }
}

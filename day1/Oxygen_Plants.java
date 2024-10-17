package day1;

import java.util.Scanner;

public class Oxygen_Plants {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the room (in m): ");
        int length = sc.nextInt();
        if (length <= 0) {
            System.out.println("Invalid length!");
        }

        System.out.print("Enter the breadth of the room (in m): ");
        int breadth = sc.nextInt();
        if (breadth <= 0) {
            System.out.println("Invalid breadth!");
        }
        System.out.print("Enter the plant area of a single plant (in cm²): ");
        int area = sc.nextInt();
        if (area <= 0) {
            System.out.println("Invalid area!");
            return;
            }
        int roomArea = length * breadth * 10000; 

        int totalPlants = roomArea / area;
            totalPlants-=totalPlants%10;
        System.out.println("Total plants: " + totalPlants);

        double totalProductionOxygen = totalPlants * 0.9;
        System.out.println("Total Production of Oxygen: " + totalProductionOxygen);
    }
}

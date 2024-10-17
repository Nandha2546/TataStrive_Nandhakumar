package lab;

import java.util.Scanner;

public class CheckPassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's mark: ");
        int mark = sc.nextInt();

        if (mark >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}


package Quizzes;

import java.util.Scanner;

public class Swipe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the A value:");
		int A = sc.nextInt();
		System.out.println("Enter the B value:");
		int B = sc.nextInt();
		A += B;
		B = A - B;
		A = Math.abs(B - A);
		System.out.println("After swiping value");
		System.out.println("A="+ A+"\nB="+B);

	}

}

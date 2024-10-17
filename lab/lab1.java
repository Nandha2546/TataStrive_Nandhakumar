package lab;
import java.util.Scanner;

public class lab1 {
	public static void main (String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your Age:");	
	int age=scan.nextInt();
	if(18<=age) {
		System.out.print("Your are eligible to vote!");
	}
	else {
		System.out.print("Your are not Eligible to vote");
	}
	
	}
}

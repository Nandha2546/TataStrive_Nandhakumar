package JUnit;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calculator cal=new Calculator();
		System.out.println("Enter the A value:");
		Double A=sc.nextDouble();
		System.out.println("Enter the B value:");
		Double B=sc.nextDouble();
		cal.add(0, 0);
		cal.sub(0, 0);
		
	}

}

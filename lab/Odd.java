package lab;
import java.util.Scanner;

public class Odd {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=scan.nextInt();
		if(a%2==1) {
			System.out.println( a + " is odd");
		}
		else {
			System.out.println(a + " is Even");
		}
	}

}

package lab;
import java.util.Scanner;
public class Bitwise {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the A value:");
		int A = sc.nextInt();
		System.out.println("Enter the B value:");
		int B = sc.nextInt();
		System.out.println(A>>>B);
		System.out.println(A>>B);
		System.out.println(A<<B);
		System.out.println(A^B);
		System.out.println(A&B);
		System.out.println(A|B);
		System.out.println(Integer.toBinaryString(A));
		System.out.println(Integer.toBinaryString(B));
	}

}

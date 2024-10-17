package lab;
import java.util.Scanner;

public class Split {
	public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the string:");
	String a=scan.nextLine();
	String b[]=a.split("[a]");
	for(int i=0;i<b.length;i++) {
		System.out.println(b[i]);
	}
	}
}

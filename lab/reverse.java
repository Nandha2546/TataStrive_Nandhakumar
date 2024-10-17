package lab;
import java.util.Scanner;
public class reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String reverse="";
		System.out.print("Enter string original to reverse:");
		String original=sc.nextLine();
		int len=original.length();
		for(int i=len-1;i>=0;i--) {
			reverse+=original.charAt(i);
		}
		System.out.println("Reversed String:"+reverse);
		System.out.println(original.equals(reverse));
	}
}

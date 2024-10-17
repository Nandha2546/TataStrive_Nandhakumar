package lab;

import java.util.Scanner;

//import java.util.Scanner;

public class StarPattern {
	private static final String i = null;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any value:");
		int n=sc.nextInt();
		//int a=0;
		int b=9;
		for(int i=1;i<=n ;i++) {
			if(i!=10) {
				System.out.println(i*b);
			}
			
		}
		
		/*System.out.print(a+ " "+b);
		for(int i=2;i<n;i++) {
			sum=a+b;
		System.out.print(" "+sum);
			a=b;
			b=sum;
		}
		/*int fact=1;
		for(int i=1;i<=n;i++) {
			 fact=fact*i;
		}
		System.out.println(fact);
		/*for(int i=sc.nextInt();i>=0;i--) {
			for(int j=0;j<i;j++){
				System.out.print("* ");
			}
			System.out.println();

		}*/
	}
	
}

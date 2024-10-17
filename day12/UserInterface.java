package day12;

import java.util.Scanner;

public class UserInterface {
	public String extractString(String sentence, int number1, int number2) {
		String FinalSentence = " ";
		try {
			FinalSentence = sentence.substring(number1, number2);
			System.out.print("the ouput string is_"+FinalSentence);
		} catch (Exception e) {
			System.out.print("Invalid index position!");
		}
		return "_Thanking you for using the application";

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		String Str = sc.nextLine();
		System.out.println("enter the FirstIndex:");
		int number1 = sc.nextInt();
		System.out.println("enter the SecondIndex:");
		int number2 = sc.nextInt();
		UserInterface ui = new UserInterface();
		System.out.println(ui.extractString(Str, number1, number2));
	}

}

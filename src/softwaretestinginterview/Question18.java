package softwaretestinginterview;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		// #18) Write a Java Program to remove all white spaces from a string with using replace().
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		System.out.println(removeSpaces(str));
	}
	public static String removeSpaces(String str) {
		str = str.replace(" ", "");
		return str;
	}

}

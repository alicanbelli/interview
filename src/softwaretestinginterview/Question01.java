package softwaretestinginterview;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {

/*
 Q #1) Write a Java Program to reverse a string without using String inbuilt function.
 */	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		String result = stringReverse(str);
		System.out.println(result);
		
	}
	public static String stringReverse(String str) {
		
		String rvrStr = "";
		for(int i = str.length()-1; i>=0; i--) {
			rvrStr += str.charAt(i);
		}
		return rvrStr;
	}

	
}

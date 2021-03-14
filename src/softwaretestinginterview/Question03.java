package softwaretestinginterview;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		
		/*
		 Q #3) Write a Java Program to swap two numbers using the third variable.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first int");
		int a = scan.nextInt();
		System.out.println("Enter second int");
		int b = scan.nextInt();
		System.out.println("BeforeSwapped a: " + a + " b: " + b);
		swapNums(a, b);
	
		scan.close();
	}
	public static void swapNums(int a, int b) {
		
		int c = a;
		a = b;
		b = c;
		System.out.println("AfterSwapped a:" + a + " b: " + b);
		
		
	}

}

package questions;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		
		// Add two numbers
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first nmber");
		int first = scan.nextInt();
		System.out.println("Please enter second number");
		int second = scan.nextInt();
		System.out.println(add(first, second));
		scan.close();
	}
	public static int add(int a, int b) {
		return a+b;
	}

}

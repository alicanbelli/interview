package softwaretestinginterview;

import java.util.Scanner;

public class Soru09 {

	public static void main(String[] args) {
		
		// #8) Write a Java Program to find whether a string or number is palindrome or not.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bise giriniz");
		String input = scan.next();
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
			if(sb.toString().equals(input)) {
				System.out.println("Palindrome");
			}else {
				System.out.println("Not palindrome");
			}
		
		
	}

}

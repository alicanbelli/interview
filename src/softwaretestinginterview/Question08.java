package softwaretestinginterview;

import java.util.*;

public class Question08 {

	public static void main(String[] args) {
		
		// #8) Write a Java Program to find whether a string or number is palindrome or not.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scan.nextLine();
		System.out.println(isPalindrome(s));
		
		
	}
	public static boolean isPalindrome(String s) {
		
		String sReverse = "";
		
		for(int i = s.length()-1; i>=0; i--) {
			sReverse += s.charAt(i);
		}
		if(s.equals(sReverse)) {
			return true;
		}else {
			return false;
		}
		
		
	}

}

package softwaretestinginterview;

import java.util.Scanner;

public class Soru08 {

	public static void main(String[] args) {
		
		// #8) Write a Java Program to find whether a string or number is palindrome or not.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String or an int");
		String str = scan.next();
		System.out.println(strPalindromeCheck(str));
		
	}
	
	public static boolean strPalindromeCheck(String str) {
		
		String strRevers = "";
			for(int i = str.length()-1; i>=0; i--) {
				strRevers += str.charAt(i);
			}
			
			if(str.equals(strRevers)) {
				return true;
			}else {
				return false;
			}
		
		
		
		
	}
	

}

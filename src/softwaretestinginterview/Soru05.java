package softwaretestinginterview;

import java.util.*;

public class Soru05 {

	public static void main(String[] args) {
		
		/*
		 Q #5) Write a Java Program to count the number of words in a string using HashMap.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		countingMethod(str);
		
		
		
	}
	
	public static void countingMethod(String str) {
		
		
		String [] strArr = str.split(" ");
		
		
		
		HashMap<Integer, String> strhm = new HashMap<>();
			for(int i = 0; i<strArr.length; i++) {
				strhm.put(i, strArr[i]);
			}
			System.out.println("Girdiginiz Stringin " + strhm.size() + " tane kelimesi vardir");
		
		
		
		
		
	}

}

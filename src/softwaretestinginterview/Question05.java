package softwaretestinginterview;

import java.util.HashMap;
import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		/*
		 Q #5) Write a Java Program to count the number of words in a string using HashMap.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String userString = scan.nextLine();
		int a = countWords(userString);
		System.out.println(a);
		
	}
	public static int countWords(String a) {
		
		HashMap<Integer, String> hm1 = new HashMap<>();
		String [] st = a.split(" ");
		for(int i=0; i<st.length; i++) {
			hm1.put(i, st[i]);
		}
		return hm1.size();
	}

}

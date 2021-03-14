package softwaretestinginterview;

import java.util.*;

public class Soru19 {

	public static void main(String[] args) {
		
		// Q #19) Write a Java Program to remove all white spaces from a string without using replace().

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = scan.nextLine();
		
			String arr [] = input.split("");
			List<String> list = new ArrayList<>();
				for(int i = 0; i<arr.length; i++) {
					if(arr[i].equals(" ")) {
						continue;
					}else {
						list.add(arr[i]);
					}
				}
					for(String w: list) {
						System.out.print(w);
					}
	}

}

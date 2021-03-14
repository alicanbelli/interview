package softwaretestinginterview;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		StringBuilder result = stringReverse(str);
		System.out.println(result);
		
	}
	public static StringBuilder stringReverse(String str) {
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append(str);
		sb1 = sb1.reverse();
		return sb1;
		
	}

}

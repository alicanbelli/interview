package softwaretestinginterview;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// #17) Write a Java Program to check Armstrong number.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		String a = scan.next();
		System.out.println(isArmstrong(a));
	}
	public static boolean isArmstrong(String a) {
		
		int basamak = a.length();
		int b = Integer.parseInt(a);
		int first = b/100;
		int second = (b%100)/10;
		int third = (b%100)%10;
		if(first*first*first + second*second*second + third*third*third == b) {
			return true;
		}else {
			return false;
		}
		
		
		
		
	}

}

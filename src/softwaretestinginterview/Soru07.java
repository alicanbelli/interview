package softwaretestinginterview;

import java.util.Scanner;

public class Soru07 {

	public static void main(String[] args) {
		
		// #7) Write a Java Program to find whether a number is prime or not.

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an int");
		int a = scan.nextInt();
		int counter = 0;
			for(int i = 2; i<=a; i++) {
				if(a%i==0) {
					counter++;
				}
			}
			if(counter==1) {
				System.out.println("Prime");
			}else {
				System.out.println("Not prime");
			}
		
		
	}

}

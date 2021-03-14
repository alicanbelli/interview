package softwaretestinginterview;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		
		// #7) Write a Java Program to find whether a number is prime or not.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number that you wanna find out prime");
		int a = scan.nextInt();
		System.out.println(isPrime(a));
	}
	public static boolean isPrime(int a) {
		
		int counter = 0;
		for(int i = 1; i<=a; i++) {
			if(a%i == 0) {
				counter++;
			}
		}
		if(counter==2) {
			return true;
		}else {
			return false;
		}
		 
		
	}

}

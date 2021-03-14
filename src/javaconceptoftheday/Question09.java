package javaconceptoftheday;

import java.util.Scanner;

public class Question09 {

	public static void main(String[] args) {
		
		// Java Program To Find The Sum Of All Digits Of A Number In
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		sumOfDigits(num);
		
	}
	public static void sumOfDigits(int num) {
		
		int numCopy = num, sum = 0;
			
			while(numCopy != 0) {
				
				sum += numCopy%10;
				
				numCopy = numCopy/10;
			}
			System.out.println("Basamaklarin toplami:" + sum);
	}

}

package softwaretestinginterview;

import java.util.Arrays;
import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		
		//#16) Write a Java Program to find the second-highest number in an array.
		int counter = 0;
		int length;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your array's length");
		length = scan.nextInt();
		int arr[] = new int[length];
		
		System.out.println("Enter your Array's elements");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}

			secondHighestNum(arr);
	}
	public static void secondHighestNum(int[] arr) {
		
		Arrays.sort(arr);
		System.out.println("Your Array's second highest nmber is " + arr[arr.length-2]);
		
	}

}

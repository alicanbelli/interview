package softwaretestinginterview;

import java.util.Arrays;
import java.util.Scanner;

public class Soru16 {

	public static void main(String[] args) {
		
		//#16) Write a Java Program to find the second-highest number in an array.

		Scanner scan = new Scanner(System.in);
		System.out.println("Array'in uzunlugunu giriniz");
		int length = scan.nextInt();
		int arr[] = new int[length];
			for(int i = 0; i<arr.length; i++) {
				System.out.println("Dizinin " + (i+1) + " nci elemanini giriniz");
				arr[i] = scan.nextInt();
			}
		
			System.out.println(Arrays.toString(arr));
			
			Arrays.sort(arr);
			
			System.out.println(Arrays.toString(arr));
			
			System.out.println("Dizideki en buyuk ikinci eleman:" + arr[arr.length-2]);
		
		
		
	}

}

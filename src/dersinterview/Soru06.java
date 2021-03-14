package dersinterview;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {
		/*
		 	Toplamlari verilen bir sayiya esit olan tum ikilileri bulunuz.
		 	Ornegin, {4, 5, 7, 11, 9, 13, 8, 12} array'inde toplamlari 20 olan
		 	(9, 11), (7, 13) ve (8, 12)'dir.
		 	
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Toplam giriniz");
		int a = scan.nextInt();
		int []arr = {4, 5, 7, 11, 9, 13, 8, 12};
		
		for(int i = 0; i<arr.length; i++) {
				for(int j=1; j<arr.length; j++) {
					if((arr[i] + arr[j]) == a) {
						System.out.println(arr[i] + " " + arr[j]);
					}
				}
		}	
	}

}

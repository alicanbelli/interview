package codingQuestions_3;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alinacak stringin her karakterini satir satir yazdiran kadu yazalim.
		 * 
		 * kemal
		 * k
		 * e
		 * m
		 * a
		 * l
		 * 
		 */
				
				Scanner input = new Scanner(System.in);
				System.out.println("Lutfen bir cumle giriniz");
				
				String str = input.nextLine();
				
				System.out.println(str);
				for (int i=0; i<str.length();i++) {
					System.out.println(str.charAt(i));
					
				}
			
input.close();

	}

}

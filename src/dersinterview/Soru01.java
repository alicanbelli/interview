package dersinterview;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ilk Stringi giriniz");
		String s1 = scan.nextLine();
		System.out.println("Ikinci Stringi giriniz");
		String s2 = scan.nextLine();
		
		isAnagram(s1,s2);

	}
	public static void isAnagram(String s1, String s2) {
		int counter = 0;
		if(s1.length() != s2.length()) {
			System.out.println("Bu Stringler 'Anagram' degildir");
		}else if(s1.isEmpty() || s2.isEmpty()) {
			System.out.println("Stringler 'Anagram' degildir");
		}else {
			
			for(int i = 0; i<s1.length(); i++) {
				for(int j = 0; j<s2.length(); j++) {
					if(s1.charAt(i) == s2.charAt(j)) {
						counter++;
					}
				}
			}
			
			}
		if(counter == s1.length()) {
			System.out.println("Stringler Anagramdir");
		}
	}

}




package dersinterview;

import java.util.*;


public class Soru01Hoca {

	public static void main(String[] args) {
		
		
		/*
		 Kullanicidan iki String aliniz.
Bu iki String'de character sayisi ve kullanilan character'ler ayni ise console'a "Bu String'ler 'Anagram'dir" yazdirin.
Aksi takdirde, "Bu String'ler 'Anagram' degildir" yazdirin.
Ornegin; "Yaka" ile "Kaya" Anagram'dir. Fakat "Yaka" ile "Kayak" anagram degildir.
		 */

			Scanner scan = new Scanner(System.in);
			System.out.println("Ilk Stringi giriniz");
			String first = scan.nextLine();
			System.out.println("Ikinci Stringi giriniz");
			String second = scan.nextLine();
			
			isAnagram(first, second);
		
	}
	public static void isAnagram(String s1, String s2) {
		
		if(s1.length() != s2.length()) {
			System.out.println("Bu Stringler Anagram degildir.");
		}else if(s1.isEmpty() || s2.isEmpty()) {
			System.out.println("Bu Stringler Anagram degildir.");
		}else {
			String a1[] = s1.toLowerCase().split("");
			Arrays.sort(a1);
			
			String a2[] = s2.toLowerCase().split("");
			Arrays.sort(a2);
			
			if(Arrays.equals(a1, a2)) {
				System.out.println("Bu Stringler Anagdamdir");
			}else {
				System.out.println("Bu Stringler Anagram degildir");
			}
		}
	}

}

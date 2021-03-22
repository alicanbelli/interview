package codingQuestions_4.day10;

import java.util.Arrays;
import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		
		
		
		/*  
		 * Anagram, bir kelimenin harflerinden başka bir kelime oluşturmaya denir.
        Kullanıcıdan alınacak  iki kelimenin Anagram durumunu belirleyen  Java kodunu yazınız.
        isAnagram("listen", "Silent") ==> true 
*/
				
			Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen birinci kelimeyi giriniz");
			String first = scan.next().toLowerCase().replace(" ", "");
			System.out.println("Lutfen ikinci kelimeyi giriniz");
			String second = scan.next().toLowerCase().replace(" ", "");
			
			System.out.println(isAnagram(first, second));
			
			
			
			scan.close();

	}
	public static boolean isAnagram(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		char [] arr1 = str1.toCharArray();
		char [] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
			
			for(int i = 0 ; i<arr1.length; i++) {
				if(arr1[i] != arr2[i]) {
					return false;
				}
			}
			return true;
		
		
		
	}

}

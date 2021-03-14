package day10;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		
		/*
		 		Polindrom bir kelimenin yada sayinin soldan saga okunusu ayni ise bu kelime yada sayilara Polindrom sayi yada kelime denir.
		 	
		 */

				Scanner scan = new Scanner(System.in);
				System.out.println("Polindrom olup olmadigini kontrol etmek istediginiz sayi/kelime 'yi giriniz");
				String s = scan.nextLine().toLowerCase();
				
				String st = "";
				
				for(int i= s.length()-1; i>=0; i--) {
					st += s.charAt(i);
				}
				
				if(s.equals(st)) {
					System.out.println("Girilen kelime/sayi Polindrome");
				}else {
					System.out.println("Girilen kelime/sayi Polindrome degil");
				}
				scan.close();
				
	}

}

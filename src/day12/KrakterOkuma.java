package day12;

import java.util.Scanner;

public class KrakterOkuma {

	public static void main(String[] args) {
	
		/* Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu, 
	     * değilse sessiz harf olduğunu ekrana yazdırsın. 
	     * Girdiği değer harf değilse yada 1 karakterden fazla ise hata mesajı gostersin. 
	     * (Test girilen harfi buyuk yada kucukluğune duyarlıdır.)
	Sesli harfler: a,e,i,o,u
	*/	
			Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen bir harf giriniz");
			String harf = scan.next().toLowerCase();
			
			if(harf.length()==1) {
				switch(harf) {
				case "a":case "e":case "i":case "o": case "u":
					System.out.println("Sesli harf giris yaptiniz");
					break;
				case "b": case "c": case "d": case "f": case "g": case "h": case "j": case "k": case "l": case "m": case "p": case "r": case "s": case "t": case "w": case "y": case "x": case "z":
					System.out.println("Sessiz harf giris yaptiniz");
					break;
					default:
						System.out.println("Hatali karakter girdiniz");
				}	
			}else {
				System.out.println("Hatali karakter sayisi girdiniz");
			}
			
	}

}

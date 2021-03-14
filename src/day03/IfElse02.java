package day03;

import java.util.Scanner;

public class IfElse02 {

	public static void main(String[] args) {
		/*
		 Kullanicidan 1 harf alalim bu harfin buyuk yada kucuk harf olup olmadigini test edelim
		 */

		
				Scanner scan = new Scanner(System.in);
				System.out.println("Bir harf giriniz");
				char a = scan.next().charAt(0);
				if(a>= 'a' && a<='z') {
					System.out.println("Kucuk harf giris yaptiniz");
				}else if(a>='A' && a<='Z') {
					System.out.println("Buyuk harf giris yaptiniz");
				}else {
					System.out.println("Harf girisi yapiniz danke schon");
				}
				scan.close();
	}

}

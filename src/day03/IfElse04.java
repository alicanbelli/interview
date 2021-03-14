package day03;

import java.util.Scanner;

public class IfElse04 {

	public static void main(String[] args) {
			/*
			 Kullanicidan 3 tane pozitif tam sayi alalim
			 
			 a+b > c >a-b 
			 a+c > b > a-c
			 b+c > a > b-c
			  Ucgen cizilebiliniz 
			  ! Ucgen cizilemez
			 */

				Scanner scan = new Scanner (System.in);
				
				System.out.println("Lutfen ucgenin  1. kenar uzunlugunu giriniz.");
				int a = scan.nextInt();
				System.out.println("Lutfen ucgenin  2. kenar uzunlugunu giriniz.");
				int b = scan.nextInt();
				System.out.println("Lutfen ucgenin  3. kenar uzunlugunu giriniz.");
				int c = scan.nextInt();
				
				if (a+b>c && a-b<c && a+c>b && b>a-c && b+c>a&& a>b-c) {
					if(a==b && a==c) {
						System.out.println("Es kenar ucgendir.");
					}else {
					System.out.println("Cesit kenar Ucgen cizilebilinir");
					}
				}else {
					System.out.println("Ucgen cizilemez.");
				}
				scan.close();

	}

}

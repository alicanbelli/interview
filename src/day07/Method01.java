package day07;

import java.util.Scanner;

public class Method01 {

	public static void main(String[] args) {
		/*
		 Saat ve dakika girildiginde saniye return eden methodu yazin
		 1 saat 3600 saniye 1 dakika 60 saniyedir.
		 */
	
			
		
		Scanner input =new Scanner(System.in);
		System.out.println("Lutfen saat ve dakika giriniz.");
		
		int sa= input.nextInt();
		int dk = input.nextInt();
		
		System.out.println("Girilen saat ve dakikanin saniye degeri: " 
		+ saniyeDonusturucu(sa, dk) + " saniyedir.");
		input.close();
	}
	
	
	

public static int  saniyeDonusturucu(int sa, int dk) {
	
	int saniye=(sa*3600)+(dk*60);
	return saniye;

}

}
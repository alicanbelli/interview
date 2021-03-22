package codingQuestions_4.day10;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		
		
			/*
			 Asal sayiyi bulabilen bir java kodu yaziniz.
			 */
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		asalBulma(a);
scan.close();
	}
	public static void asalBulma(int sayi) {
			
			int count = 0;
		
			for(int i=1; i<=sayi; i++) {
				if(sayi%i==0) {
					count++;
				}
			
			}
			if(count==2) {
				System.out.println("Girilen sayi asal sayidir");
			}else {
				System.out.println("Girilen sayi asal sayi degildir.");
			}
		
		
		
	}

}

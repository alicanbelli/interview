package codingQuestions_3;

import java.util.Scanner;

public class SwitchCase01 {

	public static void main(String[] args) {
		/*
		 Kullanicidan 1 ile 7 arasi bir gun girmesini isteyelim ve o gunun hangi gun oldugunu yazdiralim.
		 */

		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir gun giriniz");
		int gun = scan.nextInt();
		
		switch(gun) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sali");
			break;
		case 3:
			System.out.println("Carsamba");
			break;
		case 4:
			System.out.println("Persembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
		
	}
		scan.close();
	}
}

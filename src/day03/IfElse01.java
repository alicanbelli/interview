package day03;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		/*
			 Kullanicidan yas ve kilo bilgisiniz alin
			 		18 yasindan kucuk ise; kan bagisi yapamaz
			 		18 yasindan buyuk ve 50 kg'dan hafif ise "Kan bagisi yapamaz"
			 		18 yasindan buyuk ve 50 kg'dan agir ise "Kan bagisi yapabilir"
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("Yasinizi giriniz");
			int yas = scan.nextInt();
			System.out.println("Kilonzu giriniz");
			int kilo = scan.nextInt();
			
			if (yas<18) {
				System.out.println("Kan bagisi yapamazsiniz");
			}else if(yas>18 && kilo>=50) {
				System.out.println("Kan bagisi yapabilirsiniz");
			}else {
				System.out.println("Kan bagisi yapamazsiniz");
			}
			scan.close();
	}

}

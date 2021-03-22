package codingQuestions_4;

import java.util.Scanner;

public class Question022 {

	public static void main(String[] args) {
		
				Scanner scan = new Scanner(System.in);
				System.out.println("Bir sayi giriniz");
				int sayi = scan.nextInt();
				int a = 0;
				int b = 1;
				int c;
				System.out.print(0 + " " + 1);
				for(int i = 2; i<=sayi; i++) {
						c = a+b;
						System.out.print(" " + c);
						a = b;
						b = c;
				}
				
				
	}

}

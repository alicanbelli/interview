package codingQuestions_3;

import java.util.Scanner;

public class SwithCase02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner scan = new Scanner(System.in);
				System.out.println("1 ile 5 arasindaki notunuzu giriniz");
				int n = scan.nextInt();
				
				switch(n) {
				case 1:
					System.out.println("Kaldi");
					break;
				case 2:
					System.out.println("Gecer");
					break;
				case 3:
					System.out.println("Orta");
					break;
				case 4:
					System.out.println("Iyi");
					break;
				case 5:
					System.out.println("Pek iyi");
					break;
					default:
						System.out.println("Duzgun gir kanks");
					
				}
				scan.close();
	}

}

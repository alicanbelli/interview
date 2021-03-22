package codingQuestions_4;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {

	public static void main(String[] args) {
		
				/*
		 	Tas Kagit Makas Oyunu 
		 	3 tane objemiz olucak bu object'lerin birbirlerine karsi ustunlukleri vardir.
		 Tas>Makas
		 Makas>Kagit
		 Kagit>Tas
		 oyun kazanan sayisi 3 olursa oyun bitsin
		 */

			
		int numberOfFirtsWin = 0;
		int numberOfComWin = 0;
		int gameOver = 3;
		
		while(numberOfFirtsWin<gameOver && numberOfComWin<gameOver) {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("1. Oyuncu Secimi : \nTas secmek icin 0 \nMakas secmek icin 1"
					+ "\nKagit secmek icin 2");
			int myGuess = scan.nextInt();
			int comGuess = new Random().nextInt(3); // 0, 1, 2
			
			System.out.println("Sizin Seciminiz " + myGuess + "\n" + "Bilgisayarin secimi " + comGuess);
			
			if(myGuess ==comGuess) {
				System.out.println("===========");
				System.out.println("Berabere");
			}else if(myGuess == 0 && comGuess==1 || myGuess == 2 && comGuess==0 || myGuess == 1 && comGuess==2) {
				System.out.println("===========");
				System.out.println("Kullanici Kazandi");
				numberOfFirtsWin++;
			}else {
				System.out.println("===========");
				System.out.println("Bilgisayar Kazandi");
				numberOfComWin++;
			}
			
		}if(numberOfComWin==3) {
			System.out.println("====== Game Over =======");
			System.out.println("Tebrikler Kazandiniz");
		}else {
			System.out.println("====== Gamer Over ======");
			System.out.println("Malesef Kazanamadiniz");
		}
		
		
	
	}

}

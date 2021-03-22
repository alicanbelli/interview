package codingQuestions_4;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		
		/*
		 		Kullanicadan 5 tane sayi alalim bu sayilari bir array icerisine atalim.
		 i�lerindeki cift sayilarin sayisini bulacagiz
		 */

			Scanner scan = new Scanner(System.in);
			int arr[] = new int[5];
			int i = 0;
			do {		
				
				System.out.println("Lutfen indexi " + i + " olan sayiyi giriniz");
				arr[i]  = scan.nextInt();
				i++;
			}while(i<5);
			int count = 0;
			for(int j = 0 ; j<arr.length; j++) {
					if(arr[j]%2==0) {
						count++;
					}
				}
			System.out.println("Arrayde " + count + " tane cift sayi vardir");
			scan.close();
	}

}

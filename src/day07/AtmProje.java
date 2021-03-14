package day07;

import java.util.Scanner;

public class AtmProje {

	public static void main(String[] args) {
		/*
		 Bir ATM proje yazalim hesabimizda bir miktar para olsun
		 Yapilacak islemler 
		 1) hesabi goruntuleme
		 2)Para cekme
		 3) Para yatirma
		 4)Cikis
		 
		 */
		
				Scanner scan = new Scanner(System.in);
				System.out.println("Hangi islemi yapmak istersiniz 1) hesabi goruntuleme\r\n" + 
						"		 2)Para cekme\r\n" + 
						"		 3) Para yatirma\r\n" + 
						"		 4)Cikis");
				
				int islem = scan.nextInt();
				double toplamTutar = 5000;
				switch(islem) {
				case 1:
					System.out.println("Hesabinizda " +toplamTutar +  "tl bulunmaktadir");
					break;
				case 2:
					System.out.println("Cekmek istediginiz miktari giriniz ");
					int miktar = scan.nextInt();
					System.out.println("Para cekiminiz basariyla gerceklesti");
					System.out.println("Yeni hesap bakiyeniz = " + (toplamTutar-miktar));
					break;
				case 3:
					System.out.println("Yatirmak istediginiz miktari giriniz");
					int yatirilanPara = scan.nextInt();
					System.out.println("Para yatirma isleminiz basariyla gerceklesti");
					System.out.println("Yeni hesap bakiyeniz = " + (toplamTutar + yatirilanPara));
					break;
				case 4:
					System.out.println("Bizleri tercih ettiginiz icin tesekkur ederiz Iyi gunler dileriz");
					break;
					default:
						System.out.println("Yanlis giris yaptiniz lutfen tekrar deneyin");
						
					
				}
				scan.close();
		
				
	}

}

package day12;

import java.util.Scanner;

public class SwitchCaseRakamOkuma {

	public static void main(String[] args) {
		
			
			/*
			 Kullanicidan 3 basamakli bir sayi alalaim
			 Bu sayinin okunusunu ekrana yazdiran bir programi yaziniz.
			 312 ==> ucyuz on iki
			 */

			Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen 3 basamkli bir sayi giriniz");
			int sayi = scan.nextInt();
			int yuzler = sayi/100;
			int onlar = (sayi/10)%10;
			int birler = sayi%10;
			okuma(yuzler,onlar,birler);
			
			scan.close();
			
			
	}
	public static void okuma(int yuzler, int onlar, int birler){
	
		String okunus = "";
		
		switch(yuzler) {
		case 1:
			okunus += "yuz";
			break;
		case 2:
			okunus += "ikiyuz";
			break;
		case 3:
			okunus += "ucyuz";
			break;
		case 4:
			okunus += "dortyuz";
			break;
		case 5:
			okunus += "besyuz";
			break;
		case 6:
			okunus += "altiyuz";
			break;
		case 7:
			okunus += "yediyuz";
			break;
		case 8:
			okunus += "sekizyuz";
			break;
		case 9:
			okunus += "dokuzyuz";
			break;
			default:
				System.out.println("Yanlis giris");
		}
		switch(onlar) {
		case 0:
			okunus += "";
			break;
		case 1:
			okunus += " on ";
			break;
		case 2:
			okunus += " yirmi ";
			break;
		case 3:
			okunus += " otuz ";
			break;
		case 4:
			okunus += " kirk ";
			break;
		case 5:
			okunus += " elli ";
			break;
		case 6:
			okunus += " altmis ";
			break;
		case 7:
			okunus += " yetmis ";
			break;
		case 8:
			okunus += " seksen ";
			break;
		case 9:
			okunus += " doksan ";
			break;
			default:
				System.out.println("Yanlis giris");
		}
		switch(birler) {
		case 0:
			okunus +="";
			break;
		case 1:
			okunus += "bir";
			break;
		case 2:
			okunus += "iki";
			break;
		case 3:
			okunus += "uc";
			break;
		case 4:
			okunus += "dort";
			break;
		case 5:
			okunus += "bes";
			break;
		case 6:
			okunus += "alti";
			break;
		case 7:
			okunus += "yedi";
			break;
		case 8:
			okunus += "sekiz";
			break;
		case 9:
			okunus += "dokuz";
			break;
			default:
				System.out.println("Yanlis giris");
		}
		System.out.println("Girilen sayinin okunusu       " + okunus);
		
	}
	
		
	
}

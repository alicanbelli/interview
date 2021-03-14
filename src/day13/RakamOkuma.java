package day13;

import java.util.Scanner;

public class RakamOkuma {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen telefon numarasini giriniz");
		String num = scan.nextLine().replace(" ", "");
		String okunus = "";
		for(int i = 0; i<num.length(); i++) {
			String numaraIndexi = num.substring(i,i+1);
			
			switch(numaraIndexi){
			case "0":
				okunus += "sifir ";
				break;
			case "1":
				okunus += "bir ";
				break;
			case "2":
				okunus += "iki ";
				break;
			case "3":
				okunus += "uc ";
				break;
			case "4":
				okunus += "dort ";
				break;
			case "5":
				okunus += "bes ";
				break;
			case "6":
				okunus += "alti ";
				break;
			case "7":
				okunus += "yedi ";
				break;
			case "8":
				okunus += "sekiz ";
				break;
			case "9":
				okunus += "dokuz ";
				break;
				default:
					System.out.println("Yanlis girdiniz");
					break;

			}
		
		}
		System.out.println("Girilen numaranin okunusu " + okunus);
		scan.close();
		
		

	}

}

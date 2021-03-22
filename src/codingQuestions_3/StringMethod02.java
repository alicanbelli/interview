package codingQuestions_3;

import java.util.Scanner;

public class StringMethod02 {

	public static void main(String[] args) {
		// Girilen sting degerin tersini yazdiran java kodu
		
				Scanner input = new Scanner(System.in);
				System.out.println("Lutfen bir kelime giriniz");
				//String strData = input.nextLine();
				
				//int countStr =strData.length();
//				while(countStr>0) {
//					System.out.print(strData.charAt(countStr-1));
//					countStr--;
//				}
				
//				String TersStr="";
//				for (int i = countStr-1; i >=0; i--) {//adana i=4
//					TersStr=TersStr+strData.charAt(i);
//					
//				}
//				System.out.print(TersStr);
				
				StringBuilder str2 = new StringBuilder(input.nextLine());
				
				str2.reverse();
				System.out.println(str2);
input.close();

	}

}

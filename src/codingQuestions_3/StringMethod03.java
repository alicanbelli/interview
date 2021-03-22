package codingQuestions_3;

import java.util.Scanner;

public class StringMethod03 {

	public static void main(String[] args) {
		//Kullanicidan alinacak cumle icerisinde sececegimiz bir harfin kac defa gectigini bulalim.
				//bugun hava sicak ->a  return->3
				
			Scanner input =new Scanner(System.in);
			System.out.println("Lutfen bir cumle giriniz");
			
			String cumle = input.nextLine();
			System.out.println("Tekrari bulunacak harf sayisi giriniz");
			String harf=input.next().substring(0,1);
			
			int harfSayisi = 0;
			
			for (int i = 0; i <cumle.length(); i++) {
				
				if(cumle.substring(i,i+1).equals(harf)) {
					harfSayisi++;
					
				}
			
			}
			System.out.println(harf + " harfi " +harfSayisi + " defa tekrar etmistir.");

input.close();
	}

}

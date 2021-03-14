package day06;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		/*
		 Kullanıcısan 2 yayi alalim
		 1. sayi taban olsun
		 2. sayi ust
		 
		 1. sayinin ussunu hesaplayalim
		 2 3  =2*2*2 =8
		 */
				
			Scanner input = new Scanner(System.in);	
			
			System.out.println("Luften taban sayisini giriniz");
			int taban = input.nextInt();
			
			System.out.println("Lutfen uss sayisini giriniz");
			int uss = input.nextInt();
			long sonuc=1;
			
//			while (uss !=0) {
//				sonuc *= taban;
//				
//				uss--;
//				
//			}
//			System.out.println("Sonuc: " +sonuc);
		//	
//			for (;uss !=0; --uss) {
//				
//				sonuc *= taban;
//			}
		for (int i = 1; i <=uss; i++) {
			//sonuc *= taban; //3*1=3 --> 3*3=9 --> 9*3=27 --> 27*3=81
			
			sonuc= sonuc*taban;
		}
			System.out.println("Sonuc: " + sonuc);
			
//			sonuc =(long)Math.pow(taban, uss);
//			System.out.println("Sonuc: " +sonuc);

input.close();
	}

}

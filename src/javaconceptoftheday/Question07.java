package javaconceptoftheday;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		
		// 7) Armstrong number program in java
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		//9474
		checkArmstrong(num);
	}
	public static void checkArmstrong(int num) {
		
		int basamakSayisi = String.valueOf(num).length();
		int numCopy = num, sum = 0, sonBasamak, carpim;
		 
			while(numCopy != 0) {
				carpim = 1;
				sonBasamak = numCopy%10;
				for(int i = 0; i<basamakSayisi; i++) {
					carpim *= sonBasamak;
				}
				sum += carpim;
				
				numCopy = numCopy/10;
				System.out.println(carpim);
			}
			
			if(sum == num) {
				System.out.println("Armstrong");
			}else {
				System.out.println("Not armstrong");
			}
	}
}



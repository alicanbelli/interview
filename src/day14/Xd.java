package day14;

import java.util.Scanner;

public class Xd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Faktorileyini almak istediginiz sayiyi giriniz");
		int a = scan.nextInt();
		System.out.println(faktoriyel(a));
	}
	public static int faktoriyel(int a) {
		
		int carpim = 1;
		if(a == 0 || a==1) {
			System.out.println("0 ve 1 faktoriyel = 1");
		}else {
			for(int i =2; i<=a; i++) {
				carpim *=i;
			}
		}
		return carpim;
		
	}

}

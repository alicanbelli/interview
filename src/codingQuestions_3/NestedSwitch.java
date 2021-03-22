//package day05;
//
//import java.util.Scanner;
//
//public class NestedSwitch {
//
//	public static void main(String[] args) {
////		 kullanıcıdan üniversite kaçıncı sınıf ve fakültesini alanım.
////		1. sınıf ise;
////				üniversite giriş yılı
////		2. sınıf ise;
////				mimarlık 
////		syso(2. sınıf mimarlık öğrencisi)
////				mühendislik:
////		syso(2. sınıf mühendislik  öğrencisi)
////		3. sınıf ise;
////				mimarlık 
////		syso(3. sınıf mimarlık öğrencisi)
////			mühendislik:
////		syso(3. sınıf mühendislik  öğrencisi)
//
//		Scanner input = new Scanner (System.in);
//		System.out.println("Lutfen sinifinizi giriniz");
//		int yil = input.nextInt();
//		input.nextLine();
//		System.out.println("Lutfen fakulte adini yaziniz");
//		
//		String bolum = input.nextLine().toLowerCase();
//		
//		
//		switch (yil) {
//		case 1:
//			System.out.println("Universiteye giris  yili");
//			break;
//		case 2:
//			switch (bolum) {
//			case "mimarlik":
//				System.out.println("2. sinif mimarlik ogrencisi");
//				break;
//			case "muhendislik":
//				System.out.println("2. sinif muhendislik ogrencisi");
//				break;
//			}
//			break;
//		case 3:
//			switch (bolum) {
//			case "mimarlik":
//				System.out.println("3. sinif mimarlik ogrencisi");
//				break;
//			case "muhendislik":
//				System.out.println("3. sinif muhendislik ogrencisi");
//				break;
//			}
//			break;
//			
//
//		default:
//			System.out.println("Hatali giris yaptiniz.");
//		}
//	
//input.close();
//	
//	
//	}
//}
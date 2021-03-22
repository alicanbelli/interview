package codingQuestions_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManavProject {
	
	static List<String> urunListesi = new ArrayList<>();
	static List<Double> urunFiyatlari = new ArrayList<>();
	static double toplamOdenecekTutar;

	public static void main(String[] args) {
		/*
		 
		* Basit bir manav alisveris programi yaziniz.
        * 
        * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
        * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
        *           istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
        *           Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
        * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
        * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster. 
        *
        * */
		
			
			
			urunListesi.add("Domates - Urunkodu: 0");
			urunListesi.add("Biber - Urunkodu: 1");
			urunListesi.add("Erik - Urunkodu: 2");
			urunListesi.add("Karpuz - Urunkodu: 3");
			urunListesi.add("Havuc - Urunkodu: 4");
			
			urunFiyatlari.add(2.0);
			urunFiyatlari.add(4.0);
			urunFiyatlari.add(12.0);
			urunFiyatlari.add(3.0);
			urunFiyatlari.add(1.0);
			
			for(String w : urunListesi) {
				System.out.println(w);
			}
			musteriSecim();
	}
	public static void musteriSecim() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Hangi urunu secmek ister misiniz?");
		int musteriSecimi = scan.nextInt();
		
		System.out.println("Kac kilo almak istersiniz?");
		double kilo = scan.nextDouble();
		
		double urunFiyati = urunFiyatlari.get(musteriSecimi);
		double toplamUrunFiyati = urunFiyati*kilo;
		
		toplamOdenecekTutar += toplamUrunFiyati;
		System.out.println("Almis oldugunuz urunun tutari: " + toplamUrunFiyati);
		
		System.out.println("Baska bir urun almak ister misiniz? (1/2)");
		int karar = scan.nextInt();
		if(karar == 1) {
			musteriSecim();
		}else {
			kasa();
		}
		
		
		
	}
	private static void kasa() {
			System.out.println("Toplam odenecek tutar " + toplamOdenecekTutar);
	}
	

}

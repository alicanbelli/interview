package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KelimeOyunu {

	public static void main(String[] args) {
		
		
		
			List<String> kelimeler = new ArrayList<>();
			
			Scanner scan = new Scanner(System.in);
			
			boolean devamMi = true;
			
			int siraKimde = 0;
			int oyunSayisi = 0;
			
			while(devamMi) {
				
				siraKimde = oyunSayisi%2 +1;
				
				System.out.println(siraKimde + ". Kullanici kelime yazsin");
				
				String kelime = scan.next();
				kelimeler.add(kelime);
				oyunSayisi++;
				devamMi = getDevamMi(kelimeler);
			}
			int kazanan = siraKimde==1?2:1;
			System.out.println(kazanan + ". Kullanici kazandi");
			System.out.println("Girilen kelimelerin hepsi : " + "  " +kelimeler);
			scan.close();
	}
	private static boolean getDevamMi(List<String> kelimeler) {
		if(kelimeler.size()<2) {
			return true;
		}
		String sonKelime = kelimeler.get(kelimeler.size()-1);
		String birOncekiKelime = kelimeler.get(kelimeler.size()-2);
		
		if(sonKelime.length()-birOncekiKelime.length() != 1) {
			return false;
		}
		if(!sonKelime.contains(birOncekiKelime)) {
			return false;
		}
		return true;
		
		
		
	}
}

package dersinterview;

import java.util.*;

public class Soru05Hoca {

	public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Tekrarli characterleri gormek icin bir String giriniz");
			String str = scan.nextLine();
			tekrarliCharBul(str);
	}

	public static void tekrarliCharBul(String str) {
		
		String harf[] = str.split("");
		HashMap<String, Integer> map = new HashMap<>();
		
			for(String w:harf) {
				if(map.containsKey(w)) {
					int harfSayisi = map.get(w);
					map.put(w, harfSayisi+1);
				}else {
					map.put(w, 1);
				}
			}
			System.out.println(map);
			
			HashMap<String, Integer> mapSon = new HashMap<>();
			
			for(String w:harf) {
				if(map.get(w)>1) {
					mapSon.put(w, map.get(w));
				}
			}
			System.out.println(mapSon);
	}
}

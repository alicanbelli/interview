package dersinterview;

import java.util.*;

public class Soru04Hoca {

	public static void main(String[] args) {

		String s = "This is a string. This This program is counting words in a string";

		String kelime[] = s.split(" ");
		System.out.println(Arrays.toString(kelime));

		List<String> kelimeList = new ArrayList<>();

		for (String w : kelime) {
			w = w.replaceAll("\\W", "");
			kelimeList.add(w);
		}
		System.out.println(kelimeList);

		HashMap<String, Integer> kelimeSayilari = new HashMap<>();

		for (int i = 0; i < kelimeList.size(); i++) {

			if (kelimeSayilari.containsKey(kelimeList.get(i))) {
				int sayi = kelimeSayilari.get(kelimeList.get(i));
				kelimeSayilari.put(kelimeList.get(i), sayi + 1);
			} else {
				kelimeSayilari.put(kelimeList.get(i), 1);
			}
		}

		System.out.println(kelimeSayilari);
	}

}

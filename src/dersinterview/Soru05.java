package dersinterview;

import java.util.*;

public class Soru05 {

	public static void main(String[] args) {
		/* Size verilen bir String'de tekrarli character'leri ve kac kere tekrar ettigini ekrana yazdiriiniz
			
		Ornegin; String "Ali baba" ==> a=2, b=2
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scan.nextLine();
		
		String [] ch = s.split("");
		System.out.println(Arrays.toString(ch));
		List<String> asd = new ArrayList<>();
			for(int i = 0; i<ch.length; i++) {
				 
					asd.add(ch[i]);
				
			}
		System.out.println(asd);
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		for (int i = 0; i < asd.size(); i++) {

			if (hm.containsKey(asd.get(i))) {
				int sayi = hm.get(asd.get(i));
				hm.put(asd.get(i), sayi + 1);
			} else {
				hm.put(asd.get(i), 1);
			}
		}
		System.out.println(hm);
		HashMap<String, Integer> hmSon = new HashMap<>();
			for(String w: ch) {
				if(hm.get(w)>1) {
					hmSon.put(w, hm.get(w));
				}
			}
			System.out.println(hmSon);
		

	}

}

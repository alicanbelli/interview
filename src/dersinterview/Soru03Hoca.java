package dersinterview;

import java.util.*;


public class Soru03Hoca {

	public static void main(String[] args) {
		
		int a[] = {0, 2, 5, 3, 1};
		
		//Array'i liste cevir
		List<Integer> l1 = new ArrayList<>();
		for(Integer w: a) {
			l1.add(w);
		}
		System.out.println(l1);
		
		//Array'deki maximum elemani bul
		Arrays.sort(a);
		int maxEl = a[a.length-1];
		System.out.println(maxEl);
		
		//Ilk kismi al ve bir List'in icine yerlestir
		List<Integer> l11 = new ArrayList<>();
		for(int i = 0; i<=l1.indexOf(maxEl); i++) {
			l11.add(l1.get(i));
		}
		System.out.println(l11);
		
		//Ilk kismi baska bir List'in icine koy ve sort et
		List<Integer>l11Sorted = new ArrayList<>();
		l11Sorted.addAll(l11);
		Collections.sort(l11Sorted);
		System.out.println(l11Sorted);
		
		//sort etmeden once ve sort ettikten sonra list'ler esit ise tamam yaz degil ise degil yaz
		if(l11.equals(l11Sorted)) {
			System.out.println("Birinci sart tamam");
		}else {
			System.out.println("Birinci sart tamam degil");
		}
		
		//Ikinci kismi al ve bir List'in icine yerlestir
		List<Integer> l12 = new ArrayList<>();
		for(int i=l1.indexOf(maxEl); i<l1.size(); i++) {
			l12.add(l1.get(i));
		}
		System.out.println(l12);
		
		//Ikinci kismi baska bir list'in icine koy ve reverse sort et
		List<Integer> l12ReverseSorted = new ArrayList<>();
		for(Integer w:l12) {
			l12ReverseSorted.add(w);
		}
		Collections.sort(l12ReverseSorted);
		Collections.reverse(l12ReverseSorted);
		System.out.println(l12ReverseSorted);
		
		//Reverse sort etmeden once ve reverse sort ettikten sonra list'ler esit ise tamam yaz degil ise tamam degil yaz
		if(l12ReverseSorted.equals(l12)) {
			System.out.println("Ikinci sart tamam");
		}else {
			System.out.println("Ikinci sart tamam degil");
		}
		
		//Son karar
		if(l11.equals(l11Sorted) && l12ReverseSorted.equals(l12)){
			System.out.println("Bu Array Mountain Array'dir");
		}else {
			System.out.println("Bu Array Mountain Array degildir.");
		}
	}

}

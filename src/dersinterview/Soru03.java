package dersinterview;

import java.util.*;

public class Soru03 {

	public static void main(String[] args) {

		/*
		 	Mountain Array ==> [0, 2, 5, 3, 1]
		 	Mountain Olmayan Array ==> [5, 2, 7, 1, 4]
		 	Logic: En buyuk degere sahip elemanin index'ini bulunuz.
		 		Bu index'deki ve oncesindeki elemanlari yeni bir index'e siralarini bozmadan depolayin
		 	Yeni Array'i sort edin ve olusturdugunuz array ile esit mi diye kontrol edin
		 	esitse birinci kisim tamamdir 
		 */
			int arr[] = {0, 2, 5, 3, 1};
			int arr2[] = {0, 1, 2, 3, 2, 1, 0};
			int arr3[] = {0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 2}; // degil
			int arr4[] = {0, 2, 3, 3, 5, 2, 1, 0};
			mountainArr(arr);
			mountainArr(arr2);
			mountainArr(arr3);
			mountainArr(arr4);
	}
	public static void mountainArr(int arr[]) {
		
		int count1 = 0;
		int count2 = 0;
		
		int bnf [] = new int [arr.length];
		for(int i=0; i<bnf.length; i++) {
			bnf[i] = arr[i];
		}	
		Arrays.sort(bnf);
		
		int enYuksekSayi = bnf[bnf.length-1];
		
		int enYuksekSayiIndexi = 0;
			for(int i = 0; i<arr.length; i++) {
				if(arr[i] == enYuksekSayi) {
					enYuksekSayiIndexi = i ;				
				}
			}
		int arrv2[] = new int[arr.length];
			for(int i = 0 ; i < arrv2.length; i++) {
				arrv2[i] = arr[i];
			}
		int arrv2First[] = new int [enYuksekSayiIndexi+1];
			for(int i = 0; i<=enYuksekSayiIndexi; i++) {
				arrv2First[i] = arr[i];
			}
			Arrays.sort(arrv2First);
		int arrv1First[] = new int[enYuksekSayiIndexi+1];
			for(int i = 0; i<arrv1First.length; i++) {
				arrv1First[i] = arr[i];
			}
			if(Arrays.equals(arrv2First, arrv1First)) {
				count1++;
			}
			
			int arrv2Last [] = new int[arr.length/2 +1];
				for(int i = enYuksekSayiIndexi; i<arr.length; i++) {
				
					arrv2Last[i-arr.length/2] = arr[i];	
				}
				int arrv2LastXd[] = new int[arrv2Last.length];
				for(int i = 0; i<arrv2Last.length; i++) {
					arrv2LastXd[i] = arrv2Last[i];
				}
				Arrays.sort(arrv2Last);
				for(int i=0; i<arrv2Last.length/2; i++){ 
					int xd = arrv2Last[i]; 
					arrv2Last[i] = arrv2Last[arrv2Last.length -i -1]; 
					arrv2Last[arrv2Last.length -i -1] = xd; 
					}
		
		int arrv1Last[] = new int[arr.length-enYuksekSayiIndexi];
			for(int i = enYuksekSayiIndexi; i<arr.length; i++) {
				arrv1Last[i-arr.length/2] = arr[i];
			}
			if(Arrays.equals(arrv2Last, arrv1Last)) {
				count2++;
			}
			if(count1 == count2) {
				System.out.println("Bu Array Mountain Array'dir");
			}else {
				System.out.println("Bu Array Mountain Array degildir");
			}
	}
	
			
}



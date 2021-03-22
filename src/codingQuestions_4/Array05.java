package codingQuestions_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array05 {

	public static void main(String[] args) {
		/*
		 	String array icerisindeki 4 harfli kelimeleri return eden bir method yazin
		 	["Sali", "Carsamba", "Persembe", "Cuma", "Pazartesi",
		 */
		String str[] = {"sali", "carsamba",  "cuma", "ctesi", "pzar"};
		dortHarfli(str);
	}

		public static String[] dortHarfli(String [] str) {
			List  <String>str2 = new ArrayList<>();
			for(String w : str) {
				if(w.length()==4){
					str2.add(w);
				}
			}
			String []arr = new String[str2.size()];
			str2.toArray(arr);
			System.out.println(Arrays.toString(arr));
			return arr;	
		}
}

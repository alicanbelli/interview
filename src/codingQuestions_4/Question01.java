package codingQuestions_4.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question01 {

	public static void main(String[] args) {
		/*
		 		ArrayList' i Array'e ceviren java kodu yaziniz.
		 		//"Phyton", "Java", "PHP", "Perl"i "C#", "C++"
		 */

		List<String> str = new ArrayList<>();
		str.add("Phyton");
		str.add("Java");
		str.add("PHP");
		str.add("Perl");
		str.add("C#");
		str.add("C++");
		
		
		String []arr = new String [str.size()];
		
			str.toArray(arr);
			System.out.println(Arrays.toString(arr));
			
		
	}

}

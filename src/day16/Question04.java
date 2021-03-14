package day16;

import java.util.Arrays;
import java.util.HashSet;

public class Question04 {

	public static void main(String[] args) {
		
		
		HashSet<String> hs = new HashSet<>();
		hs.add("red");
		hs.add("green");
		hs.add("orange");
		hs.add("white");
		
		String [] arr = new String[hs.size()];
		hs.toArray(arr);
		System.out.println(Arrays.toString(arr));
		
	
	}

}

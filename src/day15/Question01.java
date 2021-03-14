package day15;

import java.util.Arrays;

public class Question01 {

	public static void main(String[] args) {
	
		int [] arr1 = {1, 2, 3};
		
		int [] arr2  = {4, 5, 6};
		
		int [] arr3 = getBirlestirilmisArray(arr1, arr2);
		
		System.out.println(Arrays.toString(arr3));

	}
	public static int[]  getBirlestirilmisArray(int [] array1, int[] array2) {
		
		
		
		int [] arr3 = new int [array1.length+array2.length];
			
			for(int i = 0; i<array1.length; i++) {
				arr3[i] = array1[i];
			}
			int j=0;
			for(int i = array1.length; i<arr3.length; i++) {
				arr3[i] = array2[j];
				j++;
			}
			return arr3;
	}

}

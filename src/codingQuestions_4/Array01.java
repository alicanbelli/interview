package codingQuestions_4;

import java.util.Arrays;


public class Array01 {

	public static void main(String[] args) {
		
			//Array elemanlarini buyukten kucuge siralayan Java kodunu yaziniz
			//12, 1, 5, 15, 18, 9
			int arr[] = {12, 1, 5, 15, 18, 9};
				Arrays.sort(arr);
				System.out.println(Arrays.toString(arr));
				for(int i = 0; i<arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
	}

}

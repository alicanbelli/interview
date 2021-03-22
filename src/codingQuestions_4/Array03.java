package codingQuestions_4;

import java.util.Arrays;
import java.util.Scanner;

public class Array03 {
	static int a;

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Aramak istediginiz elemani giriniz");
			a = scan.nextInt();
			int arr[] = {12, 32, 34, 54, 45};
			System.out.println(getVarmi(arr));
			scan.close();
			
	}
	public static boolean getVarmi(int num[]) {
		
		
		Arrays.sort(num);
		Arrays.binarySearch(num, a);
		if(Arrays.binarySearch(num, a)>=0) {
			return true;
		}else {
			return false;
		}
	
	}

}

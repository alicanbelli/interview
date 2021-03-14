package softwaretestinginterview;

public class Soru01 {

	public static void main(String[] args) {
		
		/*
		 Q #1) Write a Java Program to reverse a string without using String inbuilt function.
		 */	
		String isim = "Ebubekir";
		strReverse(isim);
		

	}
	public static void strReverse(String isim) {
		String isimReversed = "";
		
		for(int i=isim.length()-1; i>=0; i--) {
			isimReversed += isim.charAt(i);
		}
		System.out.println(isimReversed);
	}

}

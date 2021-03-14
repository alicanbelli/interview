package softwaretestinginterview;

public class Soru02 {

	public static void main(String[] args) {
		/*
		 Q #1) Write a Java Program to reverse a string with using String inbuilt function.
		 */	

		String ulke = "Ters Ceviren Yontem";
		
		StringBuilder sb = new StringBuilder(ulke);
		sb.reverse();
		System.out.println(sb);
		
	}
	

}

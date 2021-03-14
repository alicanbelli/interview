package dersinterview;

import java.util.*;


public class Soru04 {

	public static void main(String[] args) {
		/*
		 Sure: 10 dakika
Verilen bir String'de hangi kelimenin kac kere kullanildigini gosteren bir ptogram yaziniz
Ornegin; "This is a string. This program is counting words in a string." 
String'inde output asagidaki gibi olmalidir.
{counting=1, a=2, in=1, words=1, This=2, is=2, string.=2, program=1}
		 */

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a string");
			String str = scan.nextLine();
			
			String arr[] = str.split(" ");
			List<String> list = new ArrayList<>();
			for(int i = 0; i<arr.length; i++) {
				list.add(arr[i]);
			}
			
			
			
			for(int i = 0; i<arr.length; i++) {
				int counter = 0;
				for(int j = 0; j<list.size(); j++) {
					
					if(arr[i].equals(list.get(j))) {
						counter++;
						
					}
				}
				System.out.println(arr[i] + " = " + counter);
			}
	}

}

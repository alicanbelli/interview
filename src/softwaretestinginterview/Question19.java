package softwaretestinginterview;

import java.util.*;
public class Question19 {

	public static void main(String[] args) {
		// Q #19) Write a Java Program to remove all white spaces from a string without using replace().
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		removeSpaces(str);
	}
	public static void removeSpaces(String str) {
		String strWithoutSpaces = "";
		String ws[] = str.split("");
		List<String> listws = new ArrayList<>();
		for(int i = 0; i<ws.length; i++) {
			listws.add(ws[i]);
		}
			for(int i = 0; i<listws.size(); i++) {
				if(listws.get(i).equals(" ")) {
					 
				}else {
					strWithoutSpaces += listws.get(i);
				}
			}
			System.out.println(strWithoutSpaces);
	}

}

package questions;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {

		//Print an integer getting input from user.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer number");
		int input = scan.nextInt();
		System.out.println("User's input = " + input);
		scan.close();
	}

}

package codingQuestions_3;

import java.util.Scanner;

public class IfElse03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 1. sayiyi giriniz");
		int num1 = scan.nextInt();
		System.out.println("Lutfen 2. sayiyi giriniz");
		int  num2 = scan.nextInt();
		
		if(num1 == num2 ) {System.out.println(num1 + "=" + num2);}
		
		if(num1 != num2 ) {System.out.println(num1 + "!=" + num2);}
		
		if(num1 < num2 ) {System.out.println(num1 + "<" + num2);}
		
		if(num1 > num2 ) {System.out.println(num1 + ">" + num2);}
		
		if(num1 <= num2 ) {System.out.println(num1 + "<=" + num2);}
		
		if(num1 >= num2 ) {System.out.println(num1 + ">=" + num2);}
		
		scan.close();

	}

}

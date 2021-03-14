package softwaretestinginterview;

public class Soru03 {

	public static void main(String[] args) {
		
		/*
		 Q #3) Write a Java Program to swap two numbers using the third variable.
		 */
		
		int a = 10;
		int b = 5;
		int c = 0;
		
		System.out.println("Degismeden once " + a + " a" + b + " b");
		c=a;//a = 10 c =10
		a=b;//b=5 a=5
		b=c;//c=10 b=10
		
		System.out.println("Degistirdikten sonra " + "a:" + a + "b" + b);
	}

}

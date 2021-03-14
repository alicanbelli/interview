package questions;

public class Question06 {

	public static void main(String[] args) {
		// Swap Number

			int a = 25;
			int b = 12;
			int temp;
			
			temp = a;
			a = b;
			b = temp;
			System.out.println(a + " " + b );
			
			// Second way
			
			int c = 56;
			int d = 24;
			
			c = c-d;
			d = c+d;
			c = d-c;
			System.out.println(c + " " + d);
			
			
	}

}

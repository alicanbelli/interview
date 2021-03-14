package javaconceptoftheday;

public class Armstrong {

	public static void main(String[] args) {
		
		// Armstrong number
		int num = 152;
		System.out.println(checkArmstrong(num));

	}
	public static boolean checkArmstrong(int num) {
		
		int sum = 0,numCopy = num;
		
		while(numCopy != 0) {
			
			sum += (numCopy%10)*(numCopy%10)*(numCopy%10);
			numCopy /= 10;
			
		}
		if(sum == num) {
			return true;
		}else {
			return false;
		}
	}

}

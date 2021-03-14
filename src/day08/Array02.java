package day08;

public class Array02 {

	public static void main(String[] args) {
		
			//Array elemanlarinin toplam degerini hesaplayan Java kodu yazalim
			//1, 2, 3, 4, 5, 6, 7, 8, 9, 10
			
			int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			int toplam = 0;
			for(int i = 0; i<arr.length; i++) {
				toplam +=arr[i];
			}
			System.out.println("Toplam = " + toplam);
	} 

}

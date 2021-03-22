package codingQuestions_3;

public class While02 {

	public static void main(String[] args) {
		//girilen sayinin tersini yazdiran java kodunu yazınız
		
				//  123 --> 321
//				Scanner input = new Scanner(System.in);
//				System.out.println("Lutfen tersi alinacak sayiyi giriniz");
//				int num = input.nextInt();
				
			//	System.out.println("Girilen sayinin tersi: " + sayininTersi(543));
				sayininTersi();
				
			}
			public static void sayininTersi() {
				
				int sayi =123;
				int result =0;
				int temp=0;
				@SuppressWarnings("unused")
				int basamak=0;
				while (sayi>0) {  
					temp =sayi%10; //123 %10 -->3  12%10-->2 1%10-->1
					sayi= sayi/10; //123/10 -->12	 12/10-->1	1/10--0
					basamak +=temp;
					result =result*10+temp; //3*10+2-->32 32*10+1-->321
					
				}
				
				System.out.println("sayinin tersi: " + result);
//				System.out.println(basamak);
//				return result;


	}

}

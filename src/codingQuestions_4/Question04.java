package codingQuestions_4.day10;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		//Klavyeden girilecek plaka numarasından ili gösteren uygulamayi yazalim.
	    /*  "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara",
	        "Antalya", "Artvin", "Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis",
	        "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli",
	        "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir",
	        "Gaziantep", "Giresun", "Gümüşhane", "Hakkari", "Hatay", "Isparta",
	        "İçel (Mersin)", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
	        "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa",
	        "K.maraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize",
	        "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon",
	        "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
	        "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan",
	        "Iğdır", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"
	        */
				
			Scanner scan = new Scanner(System.in);
			System.out.println("Plakasini ogrenmek istediginiz ili giriniz");
			int i = scan.nextInt();
			
			String [] arr = {"", "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara",
			        "Antalya", "Artvin", "Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis",
			        "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli",
			        "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir",
			        "Gaziantep", "Giresun", "Gümüşhane", "Hakkari", "Hatay", "Isparta",
			        "İçel (Mersin)", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
			        "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa",
			        "K.maraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize",
			        "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon",
			        "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			        "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan",
			        "Iğdır", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"};
			
			
				System.out.println(arr[i]);
			
			
			
			
			scan.close();

	}

}

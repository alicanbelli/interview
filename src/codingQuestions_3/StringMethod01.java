package codingQuestions_3;


public class StringMethod01 {

	public static void main(String[] args) {
		/*
		 IndexOf(): Karakteri yerini belirler.
		  */
		 String str = "Istanbullu";
		 System.out.println(str.indexOf('u'));
		 //last indexOf() methodunu aradigimiz karekterin string icerisindeki son gorunum indexini verir.
		 
		System.out.println(str.lastIndexOf('u'));
		
		
		//lenght() Stringin uzunlugunu verir saymaya 1 den baslar.
		System.out.println(str.length());
		
		//Bir  string kelimenin ilk harfi le son harfini yer degistirelim.
		String isim ="Nilufer";
		
		char ilkHarf = isim.charAt(0);
		System.out.println(ilkHarf);
		
		char sonHarf = isim.charAt(isim.length()-1);
		System.out.println(sonHarf);
		
		System.out.println(sonHarf +isim.substring(1,isim.length()-1) + ilkHarf);//[1,5) 1,2,3,4
		
		//substring() Methodu stringin belilli bir kismini almamizi saglar.
		System.out.println(str.substring(4)); //Istanbullu
		System.out.println(str.substring(2,8));
		
		//contains() Sttring i�erisinde aranan karakter var ise True yok ise False doner.
		System.out.println(str.contains("iz")); //false
		System.out.println(str.contains("bul")); //true
		
		//isEmpty String icerisinde katakter yok ise true Herhangi bir karakter var ise False verir.
		
		String str1 =" ";
		System.out.println(str1.isEmpty());
		
		//trim() bass ve sonundaki bosluklari siler.
		
		String str2 ="  ankara istanbul ";
		System.out.println(str2);
		System.out.println(str2.trim());
		
		//starsWith() istenen harf ile basliyor ise true degilse false.
		System.out.println(str2.startsWith("B"));
		//concat() iki string kelimeyi birlestirir.
		String str3 ="ankARa";
		System.out.println(str.concat(str3));
		//replace() istenilen karakterin baskabir karakter ile degistirmemizisaglar.
			System.out.println(str3.replace("a", "A"));
			
		//replaceFirst() stringinilk karakterini degistirir
			str3=str3.toLowerCase();
			System.out.println(str3.replaceFirst(str3.substring(0,1), str3.substring(0,1).toUpperCase()));
		//

	}

}

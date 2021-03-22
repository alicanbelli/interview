package codingQuestions_4;

import java.util.Scanner;

public class SwithCaseRakamOkumaV2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi1 =sc.nextInt();
        int sayi=sayi1;
        int basamak=1;
        while(sayi>9){
            sayi=sayi/10;
            basamak++;
        }
        String birler[]={"","bir","iki","üç","dört","beş","altı","yedi","sekiz","dokuz"};
        String onlar[]={"","on","yirmi","otuz","kırk","elli","atmış","yetmiş","seksen","doksan"};
 
        switch(basamak){
            case 1: System.out.println(birler[sayi1]);
            break;
            case 2: System.out.println(onlar[sayi1/10]+birler[sayi1%10]);
            break;
            case 3:
                if(sayi1/100==1){ System.out.println("yüz"+onlar[(sayi1/10)%10]+birler[sayi1%10]);
                break;}
                    else{ System.out.println(birler[sayi1/100]+"yüz"+onlar[(sayi1/10)%10]+birler[sayi1%10]);
                    break;}
        }
sc.close();
	}

}

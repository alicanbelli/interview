package codingQuestions_1;

import java.util.Scanner;

public class Q_20_FactorialNumber {
    public static void main(String[] args) {

        //Factorial Number

        Scanner scan=new Scanner(System.in);
        System.out.println("Faktoryel hesaplamasi icin bir sayi giriniz...");
        int num=scan.nextInt();
        int faktoryel=1;

        for(int i=1; i<=num; i++ ){
            faktoryel=faktoryel*i;
        }
        System.out.println(num + " Sayisinin Faktoryel degeri: "+ faktoryel+ " dir... Aferin..." );





    }
}

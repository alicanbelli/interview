package codingQuestions_3;

import java.util.Scanner;

public class Q_4_Fibonacci {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir = scan.nextInt();

        int sayi1 = 0;
        int sayi2 = 1;
        int c = 0;

        //System.out.print(sayi1 + " " + sayi2);
        for (int i = 0; i < satir; i++) {

            c = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2=c;

            System.out.print(" " + c);
        }
    }
}

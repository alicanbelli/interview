package codingQuestions_2;

import java.util.Scanner;

public class Q_12_PowerNumber {

    public static void main(String[] args) {

        // Ilk yontem
        Scanner scan = new Scanner(System.in);
        System.out.println("Tabani girniz");
        int taban = scan.nextInt();
        System.out.println("Ussu giriniz");
        int us = scan.nextInt();

        int sonuc = 1;

        while(us!=0){

            sonuc *= taban;
            us--;
        }
        System.out.println(sonuc);



    }
}

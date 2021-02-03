package codingQuestions_2;

import java.util.Scanner;

public class Q_13_PowerNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Tabani girniz");
        int taban = scan.nextInt();
        System.out.println("Ussu giriniz");
        int us = scan.nextInt();

        int sonuc = 1;

        for (int i = 0; i < us; i++) {
            sonuc = sonuc * taban;
        }
        System.out.println(sonuc);
    }
}

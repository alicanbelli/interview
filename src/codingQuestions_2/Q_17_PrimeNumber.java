package codingQuestions_2;

import java.util.Scanner;

public class Q_17_PrimeNumber {
    public static void main(String[] args) {

        //sadece 1 e ve kendisine bolunen sayilar.


        int counter = 0;

        for (int i = 20; i <= 50; i++) {
            counter = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    counter++;
                }

            }
            if (counter == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

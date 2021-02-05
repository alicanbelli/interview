package codingQuestions_3;

import java.util.Scanner;

public class Q_3_UcgenSorusu2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir = scan.nextInt();
        int c = 1;
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j<=i; j++){
                System.out.print(c);
            }
            c++;
            System.out.println();
        }
    }
}

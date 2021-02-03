package codingQuestions_2;

import java.util.Scanner;

public class Q_16_PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi yada String giriniz");
        int num = scan.nextInt();
        int rev = 0;
        int yedek = num;


        while (num != 0) {

            int n = num % 10;
            rev = rev*10 +n;
            num = num/10;

        }
        System.out.println(rev);

    }
}

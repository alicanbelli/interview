package codingQuestions_1;

import java.util.Scanner;

public class Q_01_Integer {

    public static void main(String[] args) {


        //Print an integer getting input from user


        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter number");
//        int number=scan.nextInt();
//        System.out.println(number+ " numarasini girdiniz... Well done");

        System.out.println("Lutfen bir cumle yazınız");
        String str = scan.nextLine().toLowerCase();
        System.out.println("Lutfen bir harf yazınız");
        char ch = scan.next().toLowerCase().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            if (str.indexOf(ch) >= 0) {
                System.out.println("cumle aranan harfi icerir ");
            } else if (str.indexOf(ch) == -1) {
                System.out.println("cumle aranan harfi icermez");
            }
        } else {
            System.out.println(ch + " is alphabetic degil; Lutfen tekrar deneyin...");
        }
    }
}
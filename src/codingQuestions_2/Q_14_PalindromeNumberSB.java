package codingQuestions_2;

import java.util.Scanner;

public class Q_14_PalindromeNumberSB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi yada String giriniz");
        String reverse = scan.next();

        StringBuilder reversed = new StringBuilder(reverse);
        reversed.reverse();

        if(reverse.equals(reversed.toString())){
            System.out.println("Sayi yada String palindrome'dur.");
        }else{
            System.out.println("Sayi yada String palindrome degildir.");
        }

    }
}

package codingQuestions_2;

import java.util.Scanner;

public class Q_15_PalindromeNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi yada String giriniz");
        int reverse = scan.nextInt();
        String reversedString = "";
        String str = String.valueOf(reverse);

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }
        if (str.equals(reversedString)) {
            System.out.println("Sayi yada String palindrome'dur.");
        } else {
            System.out.println("Sayi yada String palindrome degildir.");
        }
    }
}

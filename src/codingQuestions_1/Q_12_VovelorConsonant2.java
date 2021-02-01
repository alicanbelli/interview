package codingQuestions_1;

import java.util.Scanner;

public class Q_12_VovelorConsonant2 {
    public static void main(String[] args) {
        //Check whether an alphabet is Vowel or Consonant
        //a,e,i,o,u


        Scanner scan = new Scanner(System.in);
        System.out.println("give me a char please");
        char ch = scan.next().toUpperCase().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vovel");
                break;
            default:
                System.out.println(ch + " is consonant");
                break;
        }


    }
}

package codingQuestions;

import java.util.Scanner;

public class Q_17_AlphaberChecker {
    public static void main(String[] args) {

        //Alphabet Checker


        Scanner scan=new Scanner(System.in);
        System.out.println("give me a char for check");
        char ch=scan.next().charAt(0);

        if ((ch >= 'a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println(ch + " is alphabetic");
        }else {
            System.out.println(ch+ " is not alphabetic");
        }


    }
}

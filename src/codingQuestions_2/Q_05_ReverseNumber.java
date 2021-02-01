package codingQuestions_2;

import java.util.Scanner;

public class Q_05_ReverseNumber {
    public static void main(String[] args) {
        //Reverse Number


        Scanner scan=new Scanner(System.in);
        System.out.println("Give me a number for reverse...");
        int num=scan.nextInt();

        String reverseNumber=String.valueOf(num);
        String reversed="";
        for(int i=reverseNumber.length()-1; i>=0; i--) {
                reversed += reverseNumber.charAt(i);
        }
        System.out.println(reversed);
    }
}

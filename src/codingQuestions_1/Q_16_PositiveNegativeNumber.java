package codingQuestions_1;

import java.util.Scanner;

public class Q_16_PositiveNegativeNumber {

    public static void main(String[] args) {

        // Positive and Negative Number Finding

        Scanner scan=new Scanner(System.in);
        System.out.println("give me a number for check");
        int num=scan.nextInt();

        if (num<0){
            System.out.println(num + " is NEGATiVE");
        }else if (num>0){
            System.out.println(num+ " is POSITIVE");
        }else{
            System.out.println(num+ " is ZERO");
        }


    }
}

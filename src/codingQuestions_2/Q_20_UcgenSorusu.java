package codingQuestions_2;

import java.util.Scanner;

public class Q_20_UcgenSorusu {
    public static void main(String[] args) {

//        ucgen sorusu

        Scanner scan=new Scanner(System.in);
        System.out.println("ucgen icin basamak sayisi verin");
        int num=scan.nextInt();


        for (int i=1; i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
//                System.out.print(j);
           }
            System.out.println();
        }


    }
}

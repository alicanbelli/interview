package codingQuestions;

import java.util.Scanner;

public class Q_10_EvenorOdd {
    static int num;
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Let us check some number");
        Thread.sleep(5000);
        check();

    }
     public static void check() throws InterruptedException {
         Scanner scan=new Scanner(System.in);
         System.out.println("Please give me a number...");
         num=scan.nextInt();
        if (num%2==0){
            Thread.sleep(3000);
            System.out.println("this is even Number");
            check();
        }else if (num%2!=0){
            Thread.sleep(3000);
            System.out.println("this is odd number");
            check();
        }else {
            System.out.println("please give me a number...");
        }



    }
}

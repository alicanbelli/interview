package codingQuestions_1;

import java.util.Scanner;

public class Q_13_LargestNumber {
    public static void main(String[] args) {
        //Largest number

        Scanner scan=new Scanner(System.in);
        System.out.println("enter first number");
        int first=scan.nextInt();
        System.out.println("enter second number");
        int second=scan.nextInt();
        System.out.println("enter third number");
        int third=scan.nextInt();

        if (first>second && first>third){
            System.out.println(first+ " in the biggest");
        }else if (second>first && second>third){
            System.out.println(second +" is the biggest");
        }else{
            System.out.println(third +" is the biggest");
        }
    }
}

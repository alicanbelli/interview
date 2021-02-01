package codingQuestions_2;

import java.util.Scanner;

public class Q_06_ReverseNumber2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("give me a number and i will reverse it");
        int num=scan.nextInt();

        int reversed=0;

        while (num!=0){               //num=      123   12  1
            int n=num%10;             //n=        3     2   1
            reversed=reversed*10+n;   //reversed  3     32  321
            num=num/10;               //num       12    1   0
        }
        System.out.println(reversed);
    }
}

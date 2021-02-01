package codingQuestions_2;

import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class Q_04_NumberofDigits {

    public static void main(String[] args) {

        // find number of digits 12344321432  ==> 11 basamakli

        Scanner scan=new Scanner(System.in);
        System.out.println("give me a number for check digits...");
        int num=scan.nextInt();
/*
        int count=0;

            while (num!=0){
                num=num/10;
                count++;
            }
        System.out.println("number of digits :" + count);

*/
            String number= String.valueOf(num);
            int count=0;
        for (int i = 1; i<=number.length() ; i++) {
            count++;
        }
        System.out.println(count);



    }
}

package codingQuestions;

import java.util.Scanner;

public class Q_14_LeapYear1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("give me a year for check");
        int year = scan.nextInt();

        //4 e bolunmezse artik degil
        //4 e bolunurse ve 100 e BOLUNMEZ ISE  ARTIK YIL
        //4 e, 100 e ve 400 e de bolunurse ARTIK YIL


        boolean leap;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        }else {
            leap=false;
        }

        if (leap){
            System.out.println(year +" is leap year");
        }else{
            System.out.println(year +" is NOT leap year");

        }

    }
}

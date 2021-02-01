package codingQuestions_1;

import java.util.Scanner;

public class Q_15_LeapYear2 {

    public static void main(String[] args) {


        //4 e bolunmezse artik degil  +
        //4 e bolunurse ve 100 e BOLUNMEZ ISE  ARTIK YIL
        //4 e, 100 e ve 400 e de bolunurse ARTIK YIL

        Scanner scan=new Scanner(System.in);
        System.out.println("give me a year for check");
        int year=scan.nextInt();

            String a=((year % 4 == 0) ? ((year % 100 == 0) ? ((year % 400 == 0) ? "artikYil" : "artik Yil degil")
                    : "artik Yil" ): "artik Yil degil");
        System.out.println(a);

    }
}

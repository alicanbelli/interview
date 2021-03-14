package otherQuestions;

import com.sun.source.tree.ContinueTree;

import java.util.Scanner;

public class Verbals {


    static int i = 1;

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);
        System.out.println("birinci kisinin dogum yili");
        int yil1 = scan.nextInt();
        System.out.println("ikinci kisinin dogum yili");
        int yil2 = scan.nextInt();

        if (yil1 > yil2) {
            System.out.println("birinci kisi kucuk");
        } else if (yil1 < yil2) {
            System.out.println("ikinci kisi kucuk");
        } else {
            System.out.println("birinci kisinin dogum ayi");
            int ay1 = scan.nextInt();
            System.out.println("ikinci kisinin dogum ayi");
            int ay2 = scan.nextInt();
            if (ay1 > ay2) {
                System.out.println("birinci kisi kucuk");
            } else if (ay1 < ay2) {
                System.out.println("ikinci kisi kucuk");
            } else {
                System.out.println("birinci kisinin dogum gunu");
                int gun1 = scan.nextInt();
                System.out.println("ikinci kisinin dogum gunu");
                int gun2 = scan.nextInt();
                if (gun1 > gun2) {
                    System.out.println("ikinci kisi buyuk");
                } else if (gun1 < gun2) {
                    System.out.println("birinci kisi buyuk");
                } else {
                    System.out.println("dogum tarihleri ayni...!");
                }
            }
        }
    }

}






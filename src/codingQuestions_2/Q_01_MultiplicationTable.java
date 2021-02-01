package codingQuestions_2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Q_01_MultiplicationTable {

    public static void main(String[] args) throws InterruptedException {

        //Generate a Multiplication Table

        Scanner scan=new Scanner(System.in);
        System.out.println("Give me a number for Multiplication Table");
        int num=scan.nextInt();
        for(int i=1; i<=10; i++){
            Thread.sleep(1000);
            System.out.println(num+" x "+i+" = "+num*i);
        }


    }
}

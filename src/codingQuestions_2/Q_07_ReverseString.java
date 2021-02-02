package codingQuestions_2;

import javax.swing.plaf.TableHeaderUI;
import java.util.Scanner;

public class Q_07_ReverseString {
    public static void main(String[] args) throws InterruptedException {

        //reverse String

        Scanner scan=new Scanner(System.in);
        System.out.println("give me a String for reverse");
        String str=scan.nextLine();

        String reverse="";

        for(int i=str.length()-1; i>=0; i--){
            reverse+=str.charAt(i);
        }
        System.out.println("the reverse of your String "+reverse);
    }
}

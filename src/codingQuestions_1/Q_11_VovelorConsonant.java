package codingQuestions_1;

import java.util.Scanner;

public class Q_11_VovelorConsonant {
    public static void main(String[] args) {

        //Check whether an alphabet is Vowel or Consonant
        //a,e,i,o,u

        Scanner scan=new Scanner(System.in);
        System.out.println("please give me a char");
        char ch=scan.next().charAt(0);
        if (ch=='a' || ch=='e' || ch=='i' || ch== 'o' || ch=='u'){
            System.out.println("it is vovel");
        }else{
            System.out.println("it is consonant");
        }




    }



}

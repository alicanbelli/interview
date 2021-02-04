package codingQuestions_2;

import java.util.Scanner;

public class Q_18_ArmstrongNumber {
    public static void main(String[] args) {
        //Armstrong Number

        Scanner scan=new Scanner(System.in);
        System.out.println("give me a number for Armstroong");
        int num=scan.nextInt();

        //153

        int basamak=0;
        int sum=0;
        int numYedek=num;


        while (num!=0){

            basamak=num%10;
            sum+=basamak*basamak*basamak;
            num=num/10;

        }
        if (numYedek==sum){
            System.out.println(sum + " Sayi armstrongdur");
        }else{
            System.out.println("degildir...");
        }


    }
}

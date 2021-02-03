package codingQuestions_2;

import java.util.Scanner;

public class Q_11_PrimeNumber {
    public static void main(String[] args) {
        //Prime Numbers/Asal SAyilar
        //sadece kendisine ve 1 e bolunen sayilara asal sayi denir.
        Scanner scan=new Scanner(System.in);
        System.out.println("Give me a number for check Prime or not?");
        int num=scan.nextInt();
        int counter=0;
      if (num<=1){
          System.out.println("Buyuk bir sayi giriniz...");
      }else{
          for (int i = 1; i <=num ; i++) {
              if (num%i==0){
                  counter++;
              }
          }
          if (counter==2){
              System.out.println("Sayi asaldir.");
          }else{
              System.out.println("Sayi asal degildir...");
          }
      }
    }
}

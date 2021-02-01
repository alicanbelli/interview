package codingQuestions_2;

import java.util.Scanner;

public class Q_02_FibonacciNumbers {
    public static void main(String[] args) {
        //Fibonacci series...
        //kendisinden once gelen sayi ile toplanmasindan elde edilen sayi dizisi...

        //0 dan baslayan ilk 10 Fibonacci sayilarini bulunuz...


        Scanner scan=new Scanner(System.in);
        System.out.println("Give me a number for Fibonacci Table");
        int num=scan.nextInt();
        int t1=0;
        int t2=1;

        for(int i=1; i<=num;i++){
            System.out.println(t1);  //   t1   0 1 1 2 3 5  8  13 21 34
            int sum=t1+t2;          //   sum   1 2 3 5 8 13 21 34 55 89
            t1=t2;                 //     t1   1 1 2 3 5 8  13 21 34 55
            t2=sum;                //     t2   1 2 3 5 8 13 21 34 55 89
        }


        //ikinci ornek......

        int num2=15;  //kac tane isteniyorsa
        int z1=0;       // ilk sayi
        int z2=1;       // ikinci sayi
        for (int i = 0; i <num2 ; i++) {

            System.out.println(z1);   //dongude surekli yazdiracak... ilk sayiyi
            int sum2=z1+z2;            // onceki sayinin toplaniydi. ilk iki sayiyi toplariz.
            z1=z2;                     // ilk sayiya ikinci sayiyi atariz.
            z2=sum2;                    // ikinci sayiya ilk iki sayinin toplamini atama yapariz.

            // yani su durumda, ilk sayi yazdirildiktan sonra; //ikinci sayiyi ILK sayi olarak atadik.
                                                              //IKINCI sayi olarak ilk iki sayinin toplamini atadik...
        }


    }
}

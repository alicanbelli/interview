package codingQuestions_2;

public class Q_02A_FibonacciNumbers {
    public static void main(String[] args) {
        //0 ile 10 arasindaki Fibo sayilari...

        int a=0;
        int b=1;

        for(int i=2; i<=10;i++){
            int sum=a+b;
            a=b;
            b=sum;
            System.out.print(sum+" ");

        }


    }
}

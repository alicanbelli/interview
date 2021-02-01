package codingQuestions_1;

public class Q_19_SumofNaturalNumber2 {
    public static void main(String[] args) {

        //1'den 50 ye kadar olan Sum of the Natural Number

        int num=50;
        int i=1;   //sifir dogal sayi degil...
        int sum=0;


        while(i<=num){
        sum=sum+i;
            i++;
        }
        System.out.println("The Sum is : "+sum);



    }
}

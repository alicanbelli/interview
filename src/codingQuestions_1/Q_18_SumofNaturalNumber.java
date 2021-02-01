package codingQuestions_1;

public class Q_18_SumofNaturalNumber {
    public static void main(String[] args) {

        //1'den 50 ye kadar olan Sum of the Natural Number

        int num=50;
        int sum=0;

        for(int i=0; i<=num; i++){
            sum=sum+i;
        }
        System.out.println("The Sum is : "+sum);

    }


}

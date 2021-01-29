package codingQuestions;

public class Q_09_Swap2 {
    public static void main(String[] args) {
        //Swap numbers

        int a=200;
        int b=100;
        System.out.println("a nin ilk degeri "+a);
        System.out.println(b);

        a=a-b;  //100
        b=a+b;  //200
        a=b-a;  //100


        System.out.println("a nin yeni degeri "+ a);
        System.out.println(b);

    }
}

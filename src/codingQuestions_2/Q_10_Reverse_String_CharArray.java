package codingQuestions_2;

public class Q_10_Reverse_String_CharArray {
    public static void main(String[] args) {
        //reverse

        char[]ch={'a','b','c'};
        for (int i = ch.length-1; i >=0 ; i--) {
            System.out.print(ch[i]+" ");
        }
    }
}

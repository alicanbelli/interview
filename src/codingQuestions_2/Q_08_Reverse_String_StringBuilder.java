package codingQuestions_2;

public class Q_08_Reverse_String_StringBuilder {
    public static void main(String[] args) {
        //reverse with StringBuilder

        String str = "alican belli";
        StringBuilder strbld = new StringBuilder(str);
        String reversed = strbld.reverse().toString();
        System.out.println(reversed);

//2 yol da bu olabilir
        String reversed2 = new StringBuilder(reversed).toString();
        System.out.println(reversed2);

    }
}

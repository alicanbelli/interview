package codingQuestions_1;

public class Q_04_ValueOf {

    public static void main(String[] args) {

        String a="2000";
        String b="4000";
        System.out.println("String olarak: "+a+b);
        int c=Integer.valueOf(a);
        int d=Integer.valueOf(b);
        System.out.println(c+d+" sayi degeri ");


        int e=123;
        int f=456;
        System.out.println(e+f +" integer olarak");
        String g=String.valueOf(e);
        String h=String.valueOf(f);
        System.out.println(g+h +" string olarak");

    }
}

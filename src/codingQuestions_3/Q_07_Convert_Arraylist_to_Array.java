package codingQuestions_3;

import java.util.ArrayList;
import java.util.List;

public class Q_07_Convert_Arraylist_to_Array {
    public static void main(String[] args) {

        List<String>arrList=new ArrayList<>();
        arrList.add("Ali");
        arrList.add("Okula");
        arrList.add("Gel");
        System.out.println(arrList.toString());
        System.out.println("Arraylisti array e cevirme....");

        String [] arr=arrList.toArray(new String[arrList.size()]);

        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        for (String w:arr) {
            System.out.print(w +" ");
        }


    }

}

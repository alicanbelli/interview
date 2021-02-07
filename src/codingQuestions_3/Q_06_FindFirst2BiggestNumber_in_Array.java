package codingQuestions_3;

import java.util.Arrays;

public class Q_06_FindFirst2BiggestNumber_in_Array {
    public static void main(String[] args) {


        int []arr={1,2,3,4,5};
        first2Biggest(arr);

    }

    private static void first2Biggest(int[] arr) {

        Arrays.sort(arr);
        System.out.println("En buyuk ikinci eleman: "+arr[arr.length-2]);
        System.out.println("En buyuk eleman: "+arr[arr.length-1]);

    }


}

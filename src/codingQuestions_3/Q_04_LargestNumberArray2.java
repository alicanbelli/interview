package codingQuestions_3;

import java.util.*;

public class Q_04_LargestNumberArray2 {
    public static void main(String[] args) {
        //find the largest number in given array


        Integer[] arr = {12, 22, 44, 2, 1};
        System.out.println(getLargest(arr,5));
    }



public static int getLargest(Integer [] arr,int total) {
    List<Integer> arrList = Arrays.asList(arr);
    Collections.sort(arrList);
    System.out.println(arrList);
    int biggest=arrList.get(total - 1);
    return biggest;
}









}

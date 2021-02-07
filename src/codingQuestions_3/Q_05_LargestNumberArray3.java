package codingQuestions_3;

public class Q_05_LargestNumberArray3 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 55,11,22,335,44};
        int maxNumber=0;
        int sizeOfArray=arr.length;
        for (int i = 0; i < sizeOfArray; i++ ){
            for(int j=i+1;j<sizeOfArray; j++){
                if(arr[i]>arr[j]){
                    maxNumber=arr[i];
                    arr[i]=arr[j];
                    arr[j]=maxNumber;
                }
            }
        }
        System.out.println(maxNumber);
    }
}

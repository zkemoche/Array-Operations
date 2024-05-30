
import java.util.Arrays;


public class Array7BubbleSort {
    public static void bubbleSort(int[] myArray) {
        /*Create array*/
        int n = myArray.length;

        for (int i = 0; i < n - 1; i++) {
           for (int j = 0; j < n - i - 1; j++) {
            if (myArray[j] > myArray[j + 1]) {
                //Swap elements
                int temp = myArray[j];
                myArray[j] = myArray[j + 1];
                myArray[j + 1] = temp;}
                
            }
           }
    
    }
}

public static void main(String[] args) {
    int[] myArray = { 5, 2, 8, 3, 1, 6, 4};
    bubbleSort(myArray);
    System.out.println(Arrays.toString(myArray));

}

import java.util.Arrays;


public class Array6ParralelSort {
    public static void main(String[] args) {
        /*Create array*/
        int[] largeArray = {5,2,8,1,3,4,5,6,5,6,67,8,9,1,23,45,54,65,77,87,34,56,89,100};
        Arrays.parallelSort(largeArray);
        
        System.out.println("Sorted array: "+ Arrays.toString(largeArray));

        String[] largerArray = {"X","x","R","r","p","P","A","a","C","c","V","v","e","E"};
        Arrays.parallelSort(largerArray);
        
        System.out.println("Sorted array: "+ Arrays.toString(largerArray));
    
    }
}
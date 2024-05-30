
import java.util.Arrays;


public class Array5Sort {
    public static void main(String[] args) {
        /*Create array*/
        String[] cars = {"Volvo","BMW","Ford","Mazda"};
        Arrays.sort(cars);
        
        System.out.println("Sorted array: ");
        /*Initialize array*/
        for (String i : cars) {
            System.out.println(i+ " ");
        }
    }
}
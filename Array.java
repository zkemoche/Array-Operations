import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 5 integers: ");

        for (int i = 0; i < 5; i++) {
            nums[i] = scanner.nextInt();
    }
    System.out.println("You input the following integers: ");

    for (int i = 0; i < 5; i++) {
        System.out.println(nums[i]);
    }
}}

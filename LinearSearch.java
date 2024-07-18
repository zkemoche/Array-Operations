public class LinearSearch {
    public static int linearSearch (int [] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main (String[] args) {
        int [] array = {1, 3, 5, 7, 9};
        int target = 5;
        System.out.println("Index of target: " + linearSearch (array, target)); // Output: 2
    }
}

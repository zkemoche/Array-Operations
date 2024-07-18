public class BinarySearch {
    // Method/Algorithm to perform binary search on a sorted array
    public static int binarysearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            // Check if target is present at mid
            if (arr[mid] == target) {
            return mid; // Target found, return index
            }

            // If target is greater, ignore left half
            if (arr[mid] < target) {
            left = mid + 1;
            }
            // If target is smaller, ignore right half h
            else {
            right = mid - 1;
            }
        }
        // Target not found
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;
        
        int result = binarysearch(arr, target);

        if (result != -1) {
            System.out.println("Element is found at index " + result);
        } else {
            System.out.println("Element is not found in array");
        }
    }
}

    

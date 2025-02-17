import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

    // Function to find the Kth smallest element in an array
    public static int findKthSmallest(Integer[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    // Function to find the Kth largest element in an array
    public static int findKthLargest(Integer[] arr, int k) {
        Arrays.sort(arr, Collections.reverseOrder());
        return arr[k - 1];
    }

    public static void main(String[] args) {
        Integer[] arr = {12, 3, 5, 7, 19};
        int k = 2;
        System.out.println("Kth smallest element is " + findKthSmallest(arr, k));
        System.out.println("Kth largest element is " + findKthLargest(arr, k));
    }
}
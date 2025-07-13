package recursion;

public class BinarySearch {
    
    public static int binarysear(int arr[], int key, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;

        if (arr[m] == key) {
            return m;
        }

        if (arr[m] < key) {
            return binarysear(arr, key, m + 1, e);
        } else {
            return binarysear(arr, key, s, m - 1);
        }
    }

    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 6, 10, 23, 45, 97}; // Sorted array

        int key = 6;

        System.out.println(binarysear(arr, key, 0, arr.length - 1));
    }
}

public class RotatedBinarySearch {
    public static int search(int[] arr, int target,int s, int e) {
        if(s>e) {
            return -1; // Base case: target not found
        }

        int mid = s + (e - s) / 2;

        if(arr[mid]==target) {
            return mid; // Target found
        }

        if(arr[s] <= arr[mid]) {
            if(target >= arr[s] && target < arr[mid]) {
                return search(arr, target, s, mid - 1); // Search in the left half
            } else {
                return search(arr, target, mid + 1, e); // Search in the right half
            }

        }

        if(target >= arr[mid] && target <= arr[e]) {
            return search(arr, target, mid + 1, e); // Search in the right half
        } else {
            return search(arr, target, s, mid - 1); // Search in the left half
        }

    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = search(arr, target, 0, arr.length - 1);
        System.out.println("Index of target " + target + ": " + result);
    }
}

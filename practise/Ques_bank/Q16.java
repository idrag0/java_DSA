import java.util.Arrays;

public class Q16 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 7, 2, 8, 5, 9, 2, 1, 7};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        int[] result = moveDuplicates(numbers);

        System.out.println("Array with Duplicates Moved: " + Arrays.toString(result));
    }

    public static int[] moveDuplicates(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isDuplicate(arr, i)) {
                result[index++] = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (!isDuplicate(arr, i)) {
                result[index++] = arr[i];
            }
        }

        return result;
    }

    public static boolean isDuplicate(int[] arr, int index) {
        for (int i = 0; i < arr.length; i++) {
            if (i != index && arr[i] == arr[index]) {
                return true;
            }
        }
        return false;
    }
}

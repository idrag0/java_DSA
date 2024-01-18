package Ques_bank;

public class Q12_small_ele {
    public static int findSmallest(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        int smallest = findSmallest(arr, index + 1);

        if (arr[index] < smallest) {
            return arr[index];
        } else {
            return smallest;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 5, -1};
        int index = 0;
        int smallestElement = findSmallest(arr, index);
        System.out.println("Smallest element in the array: " + smallestElement);
    }
}

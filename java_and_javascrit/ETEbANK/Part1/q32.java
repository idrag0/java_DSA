import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        if (hasDuplicates(arr)) {
            throw new IllegalArgumentException("Duplicate numbers found in the array!");
        } else {
            System.out.println("No duplicate numbers found in the array.");
        }
    }

    private static boolean hasDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}
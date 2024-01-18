
import java.util.ArrayList;
import java.util.List;

public class NonCommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        List<Integer> nonCommonElements = findNonCommonElements(arr1, arr2);

        System.out.println("Non-common elements:");
        for (int element : nonCommonElements) {
            System.out.println(element);
        }
    }

    public static List<Integer> findNonCommonElements(int[] arr1, int[] arr2) {
        List<Integer> nonCommonElements = new ArrayList<>();

        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                nonCommonElements.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                nonCommonElements.add(arr2[j]);
                j++;
            } else {
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            nonCommonElements.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            nonCommonElements.add(arr2[j]);
            j++;
        }

        return nonCommonElements;
    }
}

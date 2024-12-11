import java.util.ArrayList;
import java.util.List;
package ADA_Lab;

public class q {
    public static List<Integer> quickSort(List<Integer> arr) {
        int pivot = arr.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (num < pivot) {
                left.add(num);
            } else if (num == pivot) {
                equal.add(num);
            } else {
                right.add(num);
            }
        }

        List<Integer> result = new ArrayList<>();
        result.addAll(left);
        result.addAll(equal);
        result.addAll(right);

        return result;
    }
}

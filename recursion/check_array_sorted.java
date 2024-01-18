//check wheather a array is sorted or not 
// using Recursion
package recursion;
import java.util.*;

public class check_array_sorted {
    public static boolean isSorted(int arr[],int i){
        if (arr[i]>arr[i+1])
        return false;

        return isSorted(arr, i+1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(isSorted(arr, 0));
    }
}

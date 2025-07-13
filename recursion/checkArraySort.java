package recursion;

public class checkArraySort {
    public static boolean checkArraySort(int[] arr, int i) {
        if(i == arr.length) {
            return true;
        }


        return  arr[i] < arr[i+1] && checkArraySort(arr, i+1);
    }
}

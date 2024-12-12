package ETE_Exam.MTE_EXAM.recursion;
public class poduct_of_digit {
    public static int calculateProduct(int[] arr) {
        return calculateProductHelper(arr, 0);
    }
    
    private static int calculateProductHelper(int[] arr, int index) {
        if (index == arr.length) {
            return 1;
        }
        
        return arr[index] * calculateProductHelper(arr, index + 1);
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        int product = calculateProduct(arr);
        System.out.println("Product: " + product);
    }
}

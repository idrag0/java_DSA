package practise;

public class abcd {
    public static void main(String[] args) {
        System.out.println(factorial(5, 1));
    }

    public static int factorial(int n, int result) {
        if (n == 0) {
            return result;
        } else {
            return factorial(n - 1, n * result);
        }
    }
}

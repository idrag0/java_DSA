package DynamicPro;

public class fabonacci {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        int n = 10; // Example input
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
    
}

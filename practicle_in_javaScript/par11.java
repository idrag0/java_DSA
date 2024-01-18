public class par11 {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catching the specific exception
            System.out.println("Error: Division by zero");
        } finally {
            // Code that always executes, regardless of whether an exception occurred or not
            System.out.println("Finally block executed");
        }
    }

    public static int divide(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return num1 / num2;
    }
}
    

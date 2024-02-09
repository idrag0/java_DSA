import java.util.Stack;

public class Q42 {
    public static int reverseInteger(int num) {
        // Create a stack to store the digits
        Stack<Integer> stack = new Stack<>();

        // Push each digit of the number into the stack
        while (num != 0) {
            int digit = num % 10;
            stack.push(digit);
            num /= 10;
        }

        // Reconstruct the reversed number from the stack
        int reversedNum = 0;
        int multiplier = 1;
        while (!stack.isEmpty()) {
            int digit = stack.pop();
            reversedNum += digit * multiplier;
            multiplier *= 10;
        }

        return reversedNum;
    }

    public static void main(String[] args) {
        int num = 12345;
        int reversedNum = reverseInteger(num);
        System.out.println("Reversed number: " + reversedNum);
    }
}
//#endregion
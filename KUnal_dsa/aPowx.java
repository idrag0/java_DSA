
package kunal_dsa;

import java.util.*;

public class aPowx {
    public static double myPow(double a, int x) {
        if (x == 0) return 1.0;
        long exp = x;
        if (exp < 0) {
            a = 1 / a;
            exp = -exp;
        }
        double result = 1.0;
        while (exp > 0) {
            if ((exp & 1) == 1) result *= a;
            a *= a;
            exp >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (a): ");
        double a = sc.nextDouble();
        System.out.print("Enter exponent (x): ");
        int x = sc.nextInt();
        System.out.println("Result: " + myPow(a, x));
    }
    
}
package KUnal_dsa;
import java.util.*;

public class checkPrime {
    public static boolean isPrime(int n){

        return isPrimeHelper(n, 2);
    }

    private static boolean isPrimeHelper(int n,int i){
        if(n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        if(i * i > n) {
            return true; // No factors found, n is prime
        }
        if(n % i == 0) {
            return false; // Found a factor, n is not prime
        }
        return isPrimeHelper(n, i + 1); // Check next potential factor
    }
        
}

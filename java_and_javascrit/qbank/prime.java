public class prime {
    public static void main(String[] args) {
        int start = 50;
        int end = 100;
        
        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
    


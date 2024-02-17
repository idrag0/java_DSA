package ETE_Exam.practise;
import java.util.*;

public class towerOfHanoi {
    // Function to perform Tower of Hanoi using 5 towers
    public static void towerOfHanoi(int n, char source, char destination, char aux1, char aux2, char aux3) {
        if (n == 0)
            return;
        if (n == 1) {
            System.out.println("Move disk " + n + " from tower " + source + " to tower " + destination);
            return;
        }
        // Move top n-2 disks from source to auxiliary towers
        towerOfHanoi(n - 2, source, aux1, aux2, aux3, destination);
        // Move remaining 2 disks from source to destination using all towers
        System.out.println("Move disk " + (n - 1) + " from tower " + source + " to tower " + aux3);
        System.out.println("Move disk " + n + " from tower " + source + " to tower " + destination);
        System.out.println("Move disk " + (n - 1) + " from tower " + aux3 + " to tower " + destination);
        // Move n-2 disks from auxiliary towers to destination tower
        towerOfHanoi(n - 2, aux1, destination, aux2, aux3, source);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = scanner.nextInt();
        scanner.close();
        if (n <= 0) {
            System.out.println("Number of disks should be greater than zero.");
        } else {
            // Source tower is tower 1, destination tower is tower 5, auxiliary towers are towers 2, 3, 4
            char source = 'A', destination = 'B', aux1 = 'C', aux2 = 'D', aux3 = 'E';
            towerOfHanoi(n, source, destination, aux1, aux2, aux3);
        }
    }
}

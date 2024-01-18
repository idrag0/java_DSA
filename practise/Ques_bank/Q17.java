import java.util.*;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3; // Number of disks
        int source = 1; // Source tower
        int destination = 4; // Destination tower
        int auxiliary1 = 2; // Auxiliary tower 1
        int auxiliary2 = 3; // Auxiliary tower 2

        solveTowerOfHanoi(n, source, destination, auxiliary1, auxiliary2);
    }

    public static void solveTowerOfHanoi(int n, int source, int destination, int auxiliary1, int auxiliary2) {
        if (n == 0) {
            return;
        }

        if (n == 1) {
            System.out.println("Move disk 1 from tower " + source + " to tower " + destination);
            return;
        }

        // Move n-2 disks from source to auxiliary1
        solveTowerOfHanoi(n - 2, source, auxiliary1, destination, auxiliary2);

        // Move remaining 2 disks from source to destination using auxiliary1 and auxiliary2
        System.out.println("Move disk " + (n - 1) + " from tower " + source + " to tower " + auxiliary2);
        System.out.println("Move disk " + n + " from tower " + source + " to tower " + destination);
        System.out.println("Move disk " + (n - 1) + " from tower " + auxiliary2 + " to tower " + destination);

        // Move n-2 disks from auxiliary1 to destination
        solveTowerOfHanoi(n - 2, auxiliary1, destination, source, auxiliary2);
    }
}

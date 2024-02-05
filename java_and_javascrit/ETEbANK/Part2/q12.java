package Part2;
import java.util.*;
public class q12 {
    public static void main(String[] args) {
        // Create a TreeSet to store data at specified locations
        HashSet<Integer> locationData = new HashSet<>();

        // Store data at specified locations
        locationData.add(4);
        locationData.add(1);
        locationData.add(3);
        locationData.add(2);

        // Display the original data
        System.out.println("Original Data:" +locationData);
        displaySet(locationData);

        // No need to create a sorted set separately; TreeSet maintains sorted order

        // Display the sorted data
        System.out.println("\nSorted Data:");
        displaySet(locationData);

        
    }

    // Helper method to display the contents of a set
    private static void displaySet(Set<Integer> set) {
        for (Integer value : set) {
            System.out.println("Location: " + value);
        }
    }
}


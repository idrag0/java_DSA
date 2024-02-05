package Part2;
import java.util.Map;
import java.util.TreeMap;

public class q11 {
    public static void main(String[] args) {
        // Create a TreeMap to store data at specified locations
        Map<Integer, String> locationData = new TreeMap<>();

        // Store data at specified locations
        locationData.put(3, "Location C");
        locationData.put(1, "Location A");
        locationData.put(4, "Location D");
        locationData.put(2, "Location B");

        // Display the original data
        System.out.println("Original Data:");
        displayMap(locationData);

    }

    // Helper method to display the contents of a map
    private static <K, V> void displayMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}


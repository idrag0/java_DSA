import java.util.HashMap;
import java.util.Map;
package Part2;

public class q6 {
    public static void main(String[] args) {
        // Create a map
        Map<Integer, String> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        // Count the number of key-value mappings in the map
        int size = map.size();
        System.out.println("Number of key-value mappings in the map: " + size);

        // Check the presence of key 7 in the map
        boolean containsKey7 = map.containsKey(7);
        System.out.println("Key 7 is present in the map: " + containsKey7);
    }
}

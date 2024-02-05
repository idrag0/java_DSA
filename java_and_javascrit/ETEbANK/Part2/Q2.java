import java.util.ArrayList;
package Part2;

public class Q2 {
    public class ArrayListExample {
        public static void main(String[] args) {
            // Create an ArrayList of integers
            ArrayList<Integer> numbers = new ArrayList<>();

            // Add elements to the ArrayList
            numbers.add(10);
            numbers.add(20);
            numbers.add(30);
            numbers.add(40);
            numbers.add(50);

            // Print the ArrayList
            System.out.println("ArrayList: " + numbers);

            // Get the size of the ArrayList
            int size = numbers.size();
            System.out.println("Size of ArrayList: " + size);

            // Access an element at a specific index
            int element = numbers.get(2);
            System.out.println("Element at index 2: " + element);

            // Remove an element from the ArrayList
            numbers.remove(3);
            System.out.println("ArrayList after removing element at index 3: " + numbers);

            // Check if the ArrayList contains a specific element
            boolean contains = numbers.contains(40);
            System.out.println("ArrayList contains 40: " + contains);
        }
    }
}

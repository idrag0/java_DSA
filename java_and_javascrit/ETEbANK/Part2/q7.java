import java.util.ArrayList;
import java.util.ArrayList;
import java.util.HashSet;
package Part2;

public class q7 {
    public static void main(String[] args) {
        // Create an array of ArrayList
        ArrayList<Integer>[] array = new ArrayList[5];

        // Initialize each ArrayList in the array
        for (int i = 0; i < array.length; i++) {
            array[i] = new ArrayList<>();
        }

        // Add elements to the ArrayLists
        array[0].add(1);
        array[0].add(2);
        array[1].add(3);
        array[2].add(4);
        array[2].add(5);

        // Print the elements of each ArrayList
        for (ArrayList<Integer> list : array) {
            System.out.println(list);
        }
    }
    public class Main {
        public static void main(String[] args) {
            // Create an ArrayList with duplicate elements
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            arrayList.add(2);
            arrayList.add(4);
            arrayList.add(3);

            // Print the ArrayList before removing duplicates
            System.out.println("ArrayList before removing duplicates: " + arrayList);

            // Create a HashSet to store unique elements
            HashSet<Integer> set = new HashSet<>();

            // Iterate over the ArrayList and add elements to the HashSet
            for (Integer element : arrayList) {
                set.add(element);
            }

            // Clear the ArrayList
            arrayList.clear();

            // Add the unique elements from the HashSet back to the ArrayList
            arrayList.addAll(set);

            // Print the ArrayList after removing duplicates
            System.out.println("ArrayList after removing duplicates: " + arrayList);
        }
    }
}
    


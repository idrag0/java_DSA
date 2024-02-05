package Part2;
import java.util.*;
public class q8 {
    // remove duplicates from an ArrayList
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
        HashSet<Integer> list = new HashSet<>();

        //adding elements in the HashSet
        for(Integer i : arrayList){
            list.add(i);
        }

        // Clear the ArrayList
        arrayList.clear();

        //printing the HashSet
        System.out.println("HashSet: " + list);
    }
        

}

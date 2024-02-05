package Part1;
import java.util.*;
public class q2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("Original List: " + list);

        list.remove("Python");
        System.out.println("List after removing an element: " + list);

        int size = list.size();
        System.out.println("Size of the list: " + size);

        boolean contains = list.contains("Java");
        System.out.println("List contains Java: " + contains);

        list.clear();   
        System.out.println("List after clearing all elements: " + list);
    }
}

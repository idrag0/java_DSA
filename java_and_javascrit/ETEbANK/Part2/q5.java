package Part2;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.HashMap;
public class q5 {
    public static void main(String[] args) {
        // HashSet example
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("element1");
        hashSet.add("element2");
        hashSet.add("element3");

        boolean isElementPresentInHashSet = hashSet.contains("element2");
        System.out.println("Is element2 present in HashSet? " + isElementPresentInHashSet);

        // LinkedList example
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("element1");
        linkedList.add("element2");
        linkedList.add("element3");

        boolean isElementPresentInLinkedList = linkedList.contains("element2");
        System.out.println("Is element2 present in LinkedList? " + isElementPresentInLinkedList);

        // HashMap example
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "element1");
        hashMap.put(2, "element2");
        hashMap.put(3, "element3");

        boolean isKeyPresentInHashMap = hashMap.containsKey(2);
        System.out.println("Is key 2 present in HashMap? " + isKeyPresentInHashMap);
    }
}

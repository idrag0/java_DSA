import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
package Part2;

public class q3 {
    
}
public class IteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Mike");
        names.add("Emily");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}

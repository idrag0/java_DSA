package singleLL;

import java.util.LinkedList;

public class shotLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        while (!ll.isEmpty()) {
            System.out.println(ll.peek());
            ll.pop();
        }
    }
}

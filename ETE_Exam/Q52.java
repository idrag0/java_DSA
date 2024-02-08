package ETE_Exam;

import java.util.LinkedList;
import java.util.Deque;

public class Q52 {
    class Deque {

        class Node {
            int data;
            Node next;
            Node prev;
        }
        Node head;
        Node tail;

    }
    public static void main(String[] args) {
        Deque<Integer>deque = new LinkedList<>();

        deque.addFirst(10);
        deque.addFirst(20);
        deque.addFirst(30);
        deque.addLast(40);
        deque.addLast(50);


        System.out.println(deque);

        System.err.println(deque.getLast());

    }

}

package QUEUE;
import java.util.*;
public class QueueJCF {
    public static void main(String[] args) {
        //Queue<Integer> q = new LinkedList<>(); //linkedlist is a class that implements queue interface    
        Queue<Integer> q = new ArrayDeque<>(); //arraydeque is a class that implements queue interface
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

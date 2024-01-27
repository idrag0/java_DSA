package QUEUE;

import java.util.Queue;
import java.util.Stack;

public class reveseQueue {

    public static void revers(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push( q.remove() );
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }

    public static void print(Queue<Integer> q){
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new java.util.LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

         revers(q);
         print(q);
    }
}

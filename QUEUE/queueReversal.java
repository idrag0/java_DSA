package QUEUE;

import java.util.*;

public class queueReversal {
    public static void revers(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());
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
        queueReversal qr = new queueReversal();
        Queue<Integer> q = new java.util.LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        qr.revers(q);
        qr.print(q);
    }
}

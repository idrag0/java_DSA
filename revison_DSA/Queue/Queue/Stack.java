import java.util.*;

package revison_DSA.Queue.Queue;

public class QueueStack {
    
    static class Queue{
        static Stack<Integer> s1 = new Stack<Integer>();
        static Stack<Integer> s2 = new Stack<Integer>();


        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public static int remove(){
            if(s1.isEmpty()){
                System.out.println("empty");
                System.exit(1);
            }
            int x = s1.peek();
            s1.pop();
            return x;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
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

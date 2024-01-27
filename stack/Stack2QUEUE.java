package stack;

import java.util.Queue;

public class Stack2QUEUE {
    static class Stack{
       static Queue<Integer> q1 = new java.util.LinkedList<>();
       static Queue<Integer> q2 = new java.util.LinkedList<>();

       public static boolean isEmpty(){
           return q1.isEmpty() && q2.isEmpty();
       }

         //push 
            public static void push(int data){
                if(!q1.isEmpty()){
                    q1.add(data);
                }else{
                     q2.add(data);
                }
    }

    //pop
    public static int pop(){
        if(isEmpty()){
            System.out.println("empty");
            return -1;
        }
        int top = -1;

        //case 1
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top = q1.remove();
                if(q1.isEmpty()){
                    break;
                }

                q2.add(top);
            }
        }else{//case 2
            while(!q2.isEmpty()){
                top = q2.remove();
                if(q2.isEmpty()){
                    break;
                }
                q1.add(top);
            }
        }
        return top;
    }
}
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}

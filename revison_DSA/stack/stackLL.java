package revison_DSA.stack;

import java.util.Stack;

public class stackLL {
    
    public static class StackNode{
        int data;
        StackNode next;

        public StackNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    static StackNode top = null;
    static int size = 0;

    public void push(int data){
        StackNode newNode = new StackNode(data);
        
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop(){
        if(top == null){
            System.out.println("Empty Stack");
            return -1;
        }
        int tpdata = top.data;
        top = top.next;
        size--;

        return tpdata;
    }

    public int peek(){
        if(top == null){
            System.out.println("Empty Stack!");
            return -1;
        }

        return top.data;
    }

    public void print(){
        StackNode temp = top;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        stackLL s = new stackLL();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.print();

        System.out.println(s.pop());
    }
}

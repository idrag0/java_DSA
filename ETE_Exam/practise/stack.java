package ETE_Exam.practise;
public class stack {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static class Stack{
        static Node top;

        public static boolean isEmpty(){
            return top == null;
        }

        public static boolean isFull(){
            return top != null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                top=newNode;
            }

            newNode.next = top;
            top= newNode;
        }

        public static void pop(){
            
        }
    }

}

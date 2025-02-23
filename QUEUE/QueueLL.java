package QUEUE;

public class QueueLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        //add
        public void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head=tail=newNode;
                return;
            }

            tail.next=newNode;
            tail= newNode;
        }

        //remove 
        public int remove(){
            if(isEmpty()){
                System.out.println("empty");
                return -1 ;
            }

            int front=head.data;
            //single LL
            if(tail== head){
                tail=head=null;
            }else{
                head=head.next;
            }

            return front;

        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            return head.data;
        }

        public static void print(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.print();

        q.remove();//delete element from front
        q.print();

        
    }

}

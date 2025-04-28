package ETE_Exam.practise;
public class DLinkedlist {
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data =data;
            this.next= null;
            this.prev = null;
        }
    }

    static Node head;
    static Node tail;
    static int size =0;

    public static void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail= new Node(data);
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        

    } 

    public static void addLast(int data){
        Node newN = new Node(data);
        if(head == null){
            head=tail=newN;
            size++;
            return;
        }

        tail.next= newN;
        newN.prev = tail;
        tail = newN;
        size++;
    }

    public static int removeFirst(){
        if(size==0){
            System.out.println("empty");
            return -1;
        }
        else if(size ==1){
            int val= head.data;
            size--;
            head=tail= null;
            return val;
        }

        int data = head.data;

        head = head.next;
        head.prev = null;
        return data;

    }

    public int removelast(){
        if(head == null){
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            size--;
            return val;
        }

        int val = head.data;
        tail = tail.next;
        tail.next = null;
        return val;

    }

    public void printll(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> "); // Corrected the variable name from 'head' to 'temp'
            temp = temp.next;
        }
    }

    public boolean searchD(int key){
        Node temp = head;
        int i=0;
        while (i) {
            
        }
    }

    public static void main(String[] args) {
        DLinkedlist dll = new DLinkedlist();
        dll.addFirst(10);
        dll.addFirst(20);
        dll.addFirst(30);
        dll.addFirst(40);
        dll.addFirst(50);
        dll.addLast(60);
        dll.addLast(70);

        dll.printll();

        dll.removelast();
        dll.printll();
        dll.removeFirst();
        dll.printll();
    }

}

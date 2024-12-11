package revison_DSA;

public class dubblyLinkList {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    public int size(){
        Node temp=head;
        int cont=0;
        while (temp != null) {
            cont++;
            temp = temp.next;
        }
        return cont;
    }
    public int removeFirst(){
        Node temp = head;
        if(size()==0){
            System.out.print("Empty d.list");
            return Integer.MIN_VALUE;
        }
        if(size()==1){
            int val = temp.data;
            head=tail= null;
            return val;
        }

        int val = temp.data;
        head=head.next;
        head.prev=null;
        return val;
    }

    public int removeLast(){
        if(size()==0){
            System.out.println("empty List");
            return Integer.MIN_VALUE;
        }
        if(size()==1){
            int val= head.data;
            head=tail=null;
            return val;
        }
        int val= head.data;

        tail=tail.prev;
        tail.next= null;
        return val;
    }

    public void printDLL(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        dubblyLinkList dll = new dubblyLinkList();
        
        // Add elements to the doubly linked list
        dll.addFirst(5);
        dll.addLast(10);
        dll.addFirst(3);
        dll.addLast(15);
        
        // Print the doubly linked list
        dll.printDLL();
        
        // Remove elements from the doubly linked list
        dll.removeFirst();
        dll.printDLL();
        dll.removeLast();
        dll.printDLL();
    }
}

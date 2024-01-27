package doublyLinkedlist;

public class doublyLL_first {
     //Node class
     public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

        public static Node head;
        public static Node tail;
        public static int size=0;

        // add first element
        public void addfirst(int data){
            Node newNode = new Node(data);
            size++;
            if(head==null){
                head=tail=new Node(data);
                return;
            }

            newNode.next= head;
            head.prev = newNode;
            head = newNode;
        }

        void printDLL(){
            Node temp = head;
            System.out.print("null<->");
            while (temp !=null ) {
                System.out.print(temp.data+"<->");
                temp=temp.next;
            }
            System.out.println("null");
        }

        // add element to the last 
        public void addLast(int data){
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head=tail=newNode;
                return; 
            }
            
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
             
        }

        // remove firstelement
        public int revomeFirst(){
            if(head == null){
                System.out.println("Empty");
                return Integer.MIN_VALUE;
            }
            if(size==1){
                int val = head.data;
                head=tail=null;
                size--;
                return val;
            }

            int val = head.data;
            head = head.next;
            head.prev= null;
            return val;
        }

        // remove last element
        public int removeLast(){
            if(head == null){
                System.out.println("Empty");
                return Integer.MIN_VALUE;
            }
            if(size==1){
                int val = head.data;
                head=tail=null;
                size--;
                return val;
            }

            int val = tail.data;
            tail = tail.prev;
            tail.next = null;
            return val;
        }

    public static void main(String[] args) {
        doublyLL_first DDl= new doublyLL_first();

        DDl.addfirst(3);
        DDl.addfirst(2);
        DDl.addfirst(1);
        DDl.addLast(4);
        DDl.printDLL();
        System.out.println(size);
 
        DDl.revomeFirst();
        DDl.printDLL();

        DDl.removeLast();
        DDl.printDLL();
    }
}

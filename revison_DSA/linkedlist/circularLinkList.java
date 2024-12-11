package revison_DSA;

public class circularLinkList {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;
    
    public int size(){
        Node temp = head;
        int count=0;
        do{
            count++;
            temp=temp.next;
        }while(temp != head);
        return count;
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            newNode.next=head;
            return;
        }

        newNode.next=head;
        head=newNode;
        tail.next=head;
    }

    public  void addlast(int data){
        Node newNode = new Node(data);
        if(head == null){
            tail=head=newNode;
            tail.next=head;
            return;
        }

        tail.next=newNode;
        newNode.next=head;
        tail=newNode;

    }
    public void printCLL(){
        Node temp =head;
        if(head != null){
            do{
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }while(temp != head);
        }
    }

    public int removefirst(){
        if(head == null){
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }
        if(head == tail){
            int val = head.data;
            head=tail=null;
            return val;
        }
        
            int val = head.data;
            head=head.next;
            tail.next=head;
            return val; 
    }

    public int remvoeLast(){
        if(head == null){
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }
        if(head == tail){
            int val = head.data;
            head=tail=null;
            return val;
        }
        int val =tail.data;
        Node current = head;

        while(current.next != tail){
            current=current.next;
        }

        tail=current;
        tail.next=head;

        return val;
    }
    public static void main(String[] args){
        circularLinkList cll = new circularLinkList();
        cll.addFirst(10);
        cll.addFirst(20);
        cll.addFirst(30);
        cll.printCLL();
        System.out.println();
        cll.addlast(40);
        cll.addlast(50);
        cll.addlast(60);
        cll.printCLL();
        System.out.println();

        cll.removefirst();
        cll.printCLL();
        System.out.println();
        cll.remvoeLast();
        cll.printCLL();


    }
}

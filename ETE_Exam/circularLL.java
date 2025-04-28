package ETE_Exam;

public class circularLL {
    private class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }

    private Node head;
    private Node tail;

    public circularLL(){
        this.head=null;
        this.tail=null;
    }

    // add elemrnt
    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.next=head;
        tail=newNode;
    }

    // print circular linked list
    public void printCLL(){
        Node temp =head;
        if(head != null){
            do{
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }while(temp != head);
        }
    }

    //remove element form cll
    public void removeCll(int val){
        Node node = head;
        if(node == null){
            return;
        }
        if(node.data == val){
            head = node.next;
            tail.next = head;
            return;
        }
        do{
            Node n=node.next;
            if(n.data == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);
    }

    public static void main(String[] args) {
        circularLL cll = new circularLL();
        cll.add(1);
        cll.add(2);
        cll.add(3);
        cll.add(4);
        cll.add(5);
        cll.printCLL();

        System.out.println();
        
        cll.removeCll(3);
        cll.printCLL();
    }
}

package singleLL;
import java.util.LinkedList;

public class reverse_linkedList {
    //Node class
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next= null;
        }
    }

    class linkedList {
        Node head;

        public linkedList(){
            this.head=null;
        }
   

    //addint elements
    public void add(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head = newNode;
    }

    //printing a linkedlist
    public void printLL(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //Reversing LInked list
    public void reverse(){
        Node prev =null;
        Node current=head;
        Node next = null;

        while(current != null){
            next = current.next;
            current.next = prev;

             prev = current;
             current = next;
        }
        head = prev;
    }

    // delete Nth element from the end of the linked list
    public void deleteNth(int n){
        Node temp = head;
        int size=0;

        while(temp!= null){
            temp=temp.next;
            size++;
        }

        if(size == n){  // remove first elment
             head = head.next;
             return;
        }

        int i=1;
        int idxTofind = size -n;
        Node prev=head;

        while (i< idxTofind) {
            prev = prev.next;
            i++;
        }
        prev.next= prev.next.next;
    }

    pu

}


    public static void main(String [] args){
        reverse_linkedList.linkedList LL = new reverse_linkedList().new linkedList();
        LL.add(1);
        LL.add(2);
        LL.add(3);
        LL.add(4);
        LL.add(5);
        LL.add(6);
        LL.printLL();

        // System.out.println("Reversing the linked list");
        // LL.reverse();
        // LL.printLL();

        LL.deleteNth(3);
        LL.printLL();
    }

}

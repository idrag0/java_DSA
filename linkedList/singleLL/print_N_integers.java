package singleLL;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class print_N_integers {
    private int size=0;
    private Node head;
    private Node tail;
    // node
   public static class Node{
        int value;
        Node next;

        public Node(int data){
            this.value=data;
            this.next=null;
        }
    }

    //add element
    public void addFirst(int val){
        Node newNode = new Node(val);
        if(tail == null){
            tail=head;
            return;
        }
        newNode.next= head;
        head = newNode;
        size++;
    }

    // add to the last
    public void addLast(int val){
        if(tail== null){
              tail=head;
              return;
        } 
        Node newNode = new Node(val);
        tail.next=newNode;
        tail=newNode;
        size++;
    }

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
     }

     // add element at given index in likedlist
     public void add(int index,int val){
        if(index==0){
            addFirst(val);
            return;
        }

        int i=0;
        while (i<index-1) {
            temp=temp.next;
            i++;
        }

        Node newNode = new Node(val,temp.next);
        temp.next=newNode;


        newNode.next=temp.next;  // 
        temp.next=newNode;
        size++;
     }

    public static void main(String args[]){

         print_N_integers LL= new print_N_integers();

         LL.addFirst(3);
         LL.addFirst(2);
         LL.addFirst(1);
         LL.print();

         LL.addLast(4);
         LL.addLast(5);
         LL.addLast(6);
         LL.print();

         LL.add(4, 600);
         LL.add(5, 45);
         LL.print();



    }
}

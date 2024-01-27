package singleLL;

public class search_recursive {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    // size of linkedlist
    public static int size=0;

    public static void addFirst(int data){
        // step 1= create new node
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return ;
        }

        // step 2 - newNode next =head
        newNode.next=head; // Link betweent nodes

        //step 3 - head -newNode
        head=newNode;
    }

    public static void addLast(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return ;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public static void printLink(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    // you can addd any element in every place by provinding index
    // of the element
    public static void addElement(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;

        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }

        // i= idx-1; temp -> prev
        newNode.next=temp.next;
        temp.next=newNode;
    }

    //Searching Elements in Linked List using itration Methord
    public static int itrSearch(int key){ // O(n) time complexity
        Node temp = head;
        int i=0;

        while(temp != null){
            if(temp.data == key){ // key found
                return i;
            }
            temp = temp.next;
            i++;
        }

        // key not found
        return -1;
    }

     //recursive Search
     public static int helper(Node head,int key){
        if(head== null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next,key);
            if(idx == -1){
                return -1;
            }
           
        return idx+1;
    }
   //recursive search
   public static int recSearch(int key){
       return helper(head, key);
   }

    public static void main(String[] args) {
        add_elements obj_link = new add_elements();
        
        obj_link.printLink();
        obj_link.addFirst(2);
        obj_link.printLink();
        obj_link.addFirst(1);
        obj_link.printLink();

        obj_link.addLast(4);
        obj_link.printLink();
        obj_link.addLast(5);
        obj_link.printLink(); 

        // obj_link.addElement(2,3);
        // obj_link.printLink();

        System.out.println(obj_link.size);

        System.out.println();

        System.out.println(obj_link.itrSearch(3));
        System.out.println(obj_link.itrSearch(4));

        System.out.println();


        System.out.println(obj_link.recSearch(4));
        System.out.println(obj_link.recSearch(2));

    }
}


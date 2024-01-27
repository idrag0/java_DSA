package singleLL;

public class add_elements {
     //Node class
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

    public void addFirst(int data){
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

    public void addLast(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return ;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void printLink(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    // you can addd any element in every place by provinding index
    // of the element
    public void addMid(int idx, int data){
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

    // this is used to remove first Element linkedlist
    public static int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null; 
            size=0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Remove last element of linked list
    public static int removeLast(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val= head.data;
            head=tail=null;
            size=0;
            return val;
        }
        
        // prev : i = size-2
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        size --;
        return val;

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

        

        obj_link.addLast(5);
        obj_link.printLink();
        obj_link.addLast(6);
        obj_link.printLink();

        obj_link.addMid(2,3);
        obj_link.printLink();
        obj_link.addMid(3,4);
        obj_link.printLink();

        // obj_link.removeFirst();
        // obj_link.printLink();

        // obj_link.removeLast();
        // obj_link.printLink();

        // System.out.println(itr);
        // System.out.println(obj_link.size);

        System.out.println(obj_link.recSearch(3));
        System.out.println(obj_link.recSearch(4));
    }

}
// you can remove linkedList by 
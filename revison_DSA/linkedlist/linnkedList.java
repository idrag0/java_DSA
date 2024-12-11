package revison_DSA;

public class linnkedList {
    
    public class Node{
        int data;
        Node next;

        Node(int data ){
            this.data=data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void add_first_Element(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head = newNode;
        
    }

    public void add_last_ele(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }

        tail.next= newNode;
        tail=newNode;
        
    }

    public void add_at_idex(int idx,int data ){
        if(idx ==0){
            add_first_Element(data);
            return;
        }
        Node temp = head;
        Node newNode = new Node(data);
        int i=0;
        while (i<idx-1) {
            temp =temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next=newNode;
        
    }

    public int removeFirst(){
        if(size()==0){
            System.out.println("empty L.List");
            return Integer.MIN_VALUE;
        }
        else if( size()==1){
            int val = head.data;
            head=tail = null;
            return val;
        }

        int val = head.data;
        head = head.next;

        return val;
    }

    public int removeLast(){
        if(size()==0){
            System.out.println("empty L.List");
            return Integer.MIN_VALUE;
        }
        else if( size()==1){
            int val = head.data;
            head=tail = null;
            return val;
        }

        Node prev = head;
        int i =0;
        while(i<size()-2){
            prev = prev.next;
            i++;
        }

        int val = prev.next.data;
        prev.next = null;

        return val;
    }

    public void removeATindex(int idx){
        if(idx<0 || idx >= size()){
            System.out.println("Invalid Index");
            return;
        }
        if(idx == 0){
            removeFirst();
            return;
        }

        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        

    }

    public void removeAtIndex(int index) {
        if (index < 0 || index >= size()) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        Node nodeToRemove = temp.next;
        temp.next = nodeToRemove.next;
        nodeToRemove.next = null;
    }

    public void print(){
        Node temp = head;
        if(temp== null){
            System.out.print(temp.data+"->");
        }
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public int size(){
        Node temp = head;
        int count=0;
        while(temp != null){
           temp = temp.next;
            count ++;
        }

        return count;
    }

    public boolean search(int key){
        Node temp = head;
        while(temp != null){
            if(key == temp.data){
                return true;
            }
            temp=temp.next;
        }
        
        return false; 
    }




    public static void main(String args[]){
        linnkedList LL = new linnkedList();

        LL.add_first_Element(1);
        LL.add_first_Element(2);
        LL.add_last_ele(4);
        LL.add_last_ele(5);

        LL.print();
        LL.removeLast();
        LL.print();
        System.out.println(LL.size());

        if(LL.search(4)){
            System.out.print("Element found ");
        }
        else{
            System.out.print("Element not found ! ");
        }
    }
}

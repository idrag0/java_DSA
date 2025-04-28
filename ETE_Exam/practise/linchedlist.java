package ETE_Exam.practise;
public class linchedlist {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


        public boolean isEmpty(){
            return head==null & tail ==null;
        }

        public void addFirst(int data){
            Node newNode = new Node(data);
            if(head == null){
                head=newNode;
                return;
            }

            newNode.next = head;
            head= newNode;
            size++;
        }

        public void addlast(int data){
            Node newNode = new Node(data);
            if(head == null){
                head=tail=new Node(data);
                return;
            }
            tail.next= newNode;
            tail =  newNode;
            size++;
        }

        public void add(int data,int idx){
            if(idx==0){
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            Node temp = head;

            int i=0;
            while (i<idx-1) {
                temp = temp.next;
                i++;
            }

            newNode.next = temp.next;
            temp.next = newNode;
        }

        public void printLL(){
            Node temp = head;

            while (temp != null) {
                System.out.print(head.data+ " -> ");
                temp=temp.next;
            }
            System.out.println("NUll");
        }

        public int removefirst(){
            if(size==0){
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;

            }

            int data = head.data;
            head = head.next;

            return data;
        }

        public int removeFirst(){
            if(isEmpty()){
                System.out.println("empty LinkedList ");
                return Integer.MIN_VALUE;
            }else if(size==1){
                int data = head.data;

                head=tail=null;
            }

            int data = head.data;
            head = head.next;

            return data;
        }

        public int removeLast(){
            if(size==0){
                System.out.println("Empty List");
                return Integer.MIN_VALUE;
            }
            else if(size==1){
                int data = Integer.MIN_VALUE;
                head=tail=null;
                size--;

            }

            Node prev = head;
            for(int i=0; i<size-2; i++){
                prev = prev.next;
            }

            int data = prev.next.data;
            prev.next=null;
            size--;

            return data;

        }
        
        public int searchList(int key){
            Node temp = head;
            int i = 0;

            while(temp != null){
                if(temp.data == key){
                    return i;
                }
                temp = temp.next;
                i++;
            }
            return -1;
        }
        

    public static void main(String[] args) {
        linchedlist ll = new linchedlist();

        ll.addFirst(5);
        ll.addFirst(454);
        ll.addFirst(54);
        ll.addFirst(457);
        ll.addlast(123);

        ll.printLL();

        System.out.println("Removed first element: " + ll.searchList
    }
}

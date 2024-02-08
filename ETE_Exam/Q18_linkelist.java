package ETE_Exam;

public class Q18_linkelist {
    // find length of linkedlist
    static class Node{
        int data;
        Node next;

        public Node(int val){
            this.data=val;
            this.next=null;
        }
    }

        static Node head;
        static Node tail;
        static int size=0;


        public static void addFirst(int data){
            size++;
            if(head==null){
                head=tail=null;
                return;
            }
                Node newNode = new Node(data);

                newNode.next=head;
                head=newNode;

        
        }

        
        public static void addLast(int data){
            Node newNode= new Node(data);
            size++;
            if(head==null){
                head=tail=null;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
    

        public static void main(String[] args) {
        Q18_linkelist LL = new Q18_linkelist();

        LL.addFirst(1);
        LL.addFirst(2);
        LL.addFirst(3);
        LL.addLast(5);
        LL.addLast(6);
        LL.addLast(7);
        LL.addLast(8);

        System.out.println(LL.size);
        }
    }
    


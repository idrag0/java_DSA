public class circular {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static class CLinkedList{
    static Node head;
    static Node tail;
    static int size=0;

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

    public static void remove(int data){
        Node node = head;
        if(head == null){
            System.out.println("empty");
            return;
        }
        else if(size== 1 ){
            head=tail=null;
            size--;
            return;
        }
        
        do{

            Node n = node.next;
            if(n.data == data){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);
        size--;

    }

    public static void printcl(){
        Node temp =head;
        do{
            System.out.print(head.data+"->");
            temp=temp.next;
        }while(temp!= head);
            
        }
    }
        public static void main(String[] args) {
            CLinkedList list = new CLinkedList();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);
            
            list.printcl();
            list.remove(3);
            list.printcl();
        }
    }

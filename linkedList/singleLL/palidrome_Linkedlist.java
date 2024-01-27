package singleLL;
public class palidrome_Linkedlist {
    
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }


     class linkedList{
        Node head;
        
        linkedList(){
             this.head=null;
         }

         void addll(int data){
             Node newNode = new Node(data);
             newNode.next=head;
             head = newNode;
         }

        void printLL(){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }

        // slow fast Approach
        public Node findMiNode(Node head){
            Node slow = head;
            Node fast = head;

            while( fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        public boolean isPalindrome(){
            if(head == null || head.next == null){
                return true;
            }

            //step 1 find mid
            Node mid = findMiNode(head);

            //step 2 reverse mid to end
            Node curr = mid;
            Node prev = null;
             
            while(curr != null){
                Node next= curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            Node right = prev;
            Node left = head;

            // step -3  check equal 
            while(right != null){
                if(left.data != right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }
        

    }

    public static void main(String[] args) {
        palidrome_Linkedlist LL = new palidrome_Linkedlist();
        palidrome_Linkedlist.linkedList list = LL.new linkedList();
        list.addll(1);
        list.addll(2);
        list.addll(3);
        list.addll(2);
        list.addll(1);
        list.addll(7);
        list.printLL();
        System.out.println(list.isPalindrome());
    }
}

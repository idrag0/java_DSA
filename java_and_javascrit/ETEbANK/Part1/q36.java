public class q36 {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList linkedList = new LinkedList();
        
        // Add nodes to the linked list
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);
        linkedList.addNode(5);
        
        // Add data after the 4th node
        linkedList.addDataAfterNode(4, 6);
        
        // Delete the node with value 10
        linkedList.deleteNode(10);
    }
}

class LinkedList {
    Node head;
    
    class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    
    // Add a node to the linked list
    public void addNode(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    // Add data after a specific node
    public void addDataAfterNode(int nodeData, int data) {
        Node newNode = new Node(data);
        
        Node temp = head;
        while (temp != null) {
            if (temp.data == nodeData) {
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
    }
    
    // Delete a node with a specific value
    public void deleteNode(int data) {
        Node temp = head;
        Node prev = null;
        
        if (temp != null && temp.data == data) {
            head = temp.next;
            return;
        }
        
        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }
        
        if (temp == null) {
            return;
        }
        
        prev.next = temp.next;
    }
}

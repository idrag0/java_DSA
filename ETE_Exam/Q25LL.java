class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList {
    ListNode head;

    // Method to concatenate two singly linked lists
    public void concatenate(LinkedList list2) {
        if (head == null) {
            head = list2.head;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = list2.head;
        }
    }

    // Method to add a new node to the linked list
    public void add(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to print the linked list
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        LinkedList list2 = new LinkedList();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        System.out.println("List 1:");
        list1.printList();

        System.out.println("List 2:");
        list2.printList();

        list1.concatenate(list2);

        System.out.println("Concatenated List:");
        list1.printList();
    }
}

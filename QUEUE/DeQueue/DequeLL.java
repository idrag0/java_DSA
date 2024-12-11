package QUEUE.DeQueue;

public class DequeLL {
    
    private class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
            this.next = this.prev = null;
        }
    }

    private Node head, tail;
    private int size;

    public DequeLL() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public int removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
        int data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        size--;
        return data;
    }

    public int removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
        int data = tail.data;
        tail = tail.prev;
        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
        size--;
        return data;
    }

    public int peekFirst() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
        return head.data;
    }

    public int peekLast() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
        return tail.data;
    }

    public static void main(String[] args) {
        DequeLL deque = new DequeLL();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(0);
        System.out.println("First element: " + deque.peekFirst()); // Output: 0
        System.out.println("Last element: " + deque.peekLast());   // Output: 2
        System.out.println("Removed first: " + deque.removeFirst()); // Output: 0
        System.out.println("Removed last: " + deque.removeLast());   // Output: 2
        System.out.println("First element: " + deque.peekFirst()); // Output: 1
    }
}
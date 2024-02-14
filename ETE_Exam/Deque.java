
package ETE_Exam;

public class Deque {
    private int[] deque;
    private int front;
    private int rear;
    private int size;
    
    
    public Deque(int capacity) {
        deque = new int[capacity];
        front = -1;
        rear = 0;
        size = 0;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == deque.length;
    }
    
    public void insertFront(int item) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot insert front.");
            return;
        }
        
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = deque.length - 1;
        } else {
            front--;
        }
        
        deque[front] = item;
        size++;
    }
    
    public void insertRear(int item) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot insert rear.");
            return;
        }
        
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (rear == deque.length - 1) {
            rear = 0;
        } else {
            rear++;
        }
        
        deque[rear] = item;
        size++;
    }
    
    public int deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot delete front.");
            return -1;
        }
        
        int item = deque[front];
        
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == deque.length - 1) {
            front = 0;
        } else {
            front++;
        }
        
        size--;
        return item;
    }
    
    public int deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot delete rear.");
            return -1;
        }
        
        int item = deque[rear];
        
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = deque.length - 1;
        } else {
            rear--;
        }
        
        size--;
        return item;
    }
    
    public int getFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty. No front element.");
            return -1;
        }
        
        return deque[front];
    }
    
    public int getRear() {
        if (isEmpty() || rear < 0) {
            System.out.println("Deque is empty. No rear element.");
            return -1;
        }
        
        return deque[rear];
    }
    
    public int size() {
        return size;
    }
}

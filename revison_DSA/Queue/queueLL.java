package revison_DSA.Queue;
// thsi revision version
public class queueLL {
    
    public static class QNode{
        int data;
        QNode next;

        QNode(int x){
            this.data =x;
            this.next = null;
        }
    }

    public static QNode front = null;
    public static QNode rear = null;
    public static int size = 0;


    public static void push(int data){
        QNode newNode = new QNode(data);
        size++;
        if(rear == null){
            rear = front = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public static int pop(){
        if(front == null){
            System.out.println("empty");
            return -1;
        }
        int value = front.data;
        front = front.next;
        size--;

        return value;
    }

    public static int top(){
        if(front == null){
            System.out.println("empty");
            return -1;
        }
        return front.data;
    }

    public static int size(){
        return size;
    }

    public static boolean isEmpty(){
        return front == null;
    }

    

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        push(60);

        System.out.println("Popped from queue : " + pop());
        System.out.println("Popped from queue : " + pop());

    }
}

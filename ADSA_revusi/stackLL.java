public class stackLL {
    public static Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node top = null;

    public void push(int data){
        Ndoe newNode = new Node(data);
        if(top == null){
            top = newNode;
        }

        newNode.next = top;
        top = newNode;
    }

    int pop(){
        if(isEmpty()){
            return -1;
        }
        if(top.next == null){
            int val = top.data;
            top = null;

            return val;
        }

        int val = top.data;
        top = top.next;
        
        return val;
    }

    int peek(){
        return top.data;
    }
}

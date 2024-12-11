package revison_DSA.stack;

public class stackUsingArray {
    int st[] = new int[10];
    int top = -1;


    public void push(int data){
        if(top == 9){
            System.out.println("Stack is full!");
        }
        top++;
        st[top] = data;
    }

    public void pop(){
        if(top == -1){
           System.out.println("Stack is empty!");
        }
        top--;
    }

    public int size(){
        if(top == -1){
            return -1;
        }

        return top+1;
    }

    public int peek(){
        if(top==-1){
            return -1;
        }
        return st[top];
    }

    public void print(){
        if(top==-1){
            System.out.println("Stack Empty!");
        }
        for(int i=size()-1;i>=0;i--){
            System.out.println(st[i]);
        }
        System.out.println();
    }

    public static void main(String[] args){
        stackUsingArray stack = new stackUsingArray();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.print();
        System.out.println(stack.size());
        System.out.println(stack.peek());

        stack.pop();
        stack.print();
        System.out.println(stack.size());
        System.out.println(stack.peek());
    }

}

package stack;
// reverse integer using stack
import java.util.Stack;

public class reverse_integer {
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    public int reverseInt(int num){
        Stack<Integer> s= new Stack<>();

        while(num!=0){
            int rem = num%10;
            pushAtBottom(s,rem);
            num=num/10;
        }

        int reverse=0;
        while (!s.isEmpty()) {
            int digit=s.pop();
            reverse=reverse*10+digit;
        }
        return reverse;

    }
    public static void main(String args[]){
        int num=12345;
        reverse_integer obj = new reverse_integer();
        int result=obj.reverseInt(num);

        System.out.println(result);
    }
}


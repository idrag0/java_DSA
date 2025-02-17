
import java.util.*;
public class stack2Queue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public boolean isEmpty(){
        return q1.isEmpty() && q2.isEmpty();
    }

    void push(int data){
        if(!q1.isEmpty()){
            q1.add(data);
        }else{
            q2.add(data);
        }
    }
}

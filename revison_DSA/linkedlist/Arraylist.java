package revison_DSA;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(3,5);

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}

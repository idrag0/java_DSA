package arrayList;
import java.util.ArrayList;

// it is  same as vector in ccccccccccccccccccc++++++++++++++++

public class arraylist1 {
    public static void main(String []args){
        int n=10;
        ArrayList<Integer> arr1= new ArrayList<Integer>(n);
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Double> list3 = new ArrayList<>();

        for(int i=0;i<5;i++){
            // Adding elements in Array list
            arr1.add(i);
            list2.add("hello "+i);
            list3.add(i*0.5);
        }
        // System.out.println("Interger: "+arr1);
        // System.out.println("String: "+list2);
        // System.out.println("doouble: "+list3);

        //removing element from ArrayLIst
    
        arr1.remove(2);
        list2.remove(4);


        // Seting up elements in ArrayList

        arr1.set(2, 3221432);
        list3.set(3, 2342342343124.2343241241);


        System.out.println("Interger: "+arr1);
        System.out.println("String: "+list2);
        System.out.println("doouble: "+list3);

    }
}

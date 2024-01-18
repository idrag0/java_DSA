package arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class swap_arrList {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2 ){
        int temp= list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);

    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(9);

        int idx1=1,idx2=2;
        System.out.println(list);
        //Swaping this
        swap(list,idx1,idx2);
        System.out.println(list);


        //sorting
        Collections.sort(list);
        System.out.println("Sorted form: "+list);
    }
}
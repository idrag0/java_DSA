package Heaps;
import java.util.ArrayList;

public class minHeap {
    static class heap{
        ArrayList<Integer> arr = new ArrayList<>();

        // adding element in heap
        public void add(int data){
            // add at last idx
            arr.add(data);

            int x = arr.size()-1;// x is child index
            int par =(x-1)/2; // parent index

            while(arr.get(x) < arr.get(par)){ // O( Log(n) )
                //swap
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par ,temp);

                x = par;
                par = (x-1)/2;
            }
        }

        //minimum element
        public int peek(){
            return arr.get(0);
        }

        //fixing heap
        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            //left is small than root
            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }

            //right is small than root
            if( right <arr.size() &&  arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }

            if(minIdx != i){
                //swap
                 int temp = arr.get(i);
                 arr.set(i,arr.get(minIdx));
                 arr.set(minIdx, temp);

                 heapify(minIdx);
            }
        }

        //remove element
        public int remove(){
           int data = arr.get(arr.size()-1);

           //step 1 - swap first
           int temp = arr.get(0);
           arr.set(0, arr.get(arr.size()-1));
           arr.set(arr.size()-1, temp);

           //step 3 remove
           arr.remove(arr.size()-1);
           heapify(0);
           
           return data;
        }

        // heap is empty
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String args[]){
        heap h = new heap();
        h.add(10);
        h.add(20);
        h.add(40);
        h.add(30);
        h.add(50);
        h.add(60);
        
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }

}

package ETE_Exam.practise;


/**
 * The bubbleSort class implements the bubble sort algorithm to sort an array of integers in ascending order.
 */

 import java.util.Arrays; // Add missing import statement
public class bubbleSort {
    public static void Bubblesort(int arr[]){
        int size= arr.length;
        for(int i=0; i<size; i++){
            for(int j=0; j<size-i ; j++){ // Modify inner loop condition
                if(arr[j] < arr[j+1]){
                    // swap

                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }{
                    
                }
            }
        }
        int i=0;
        while(i<size){
            System.out.print(arr[i] +" ");
            i++;
        }
    }

    public static void main(String args[]){
        int arr[]= { 1,5,3,12,7,82,3,4,022};
        Bubblesort(arr);
    }
}
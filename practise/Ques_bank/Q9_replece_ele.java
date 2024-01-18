package Ques_bank;
// Write a Java program to replace a 
// specific element with an other element in array each time.

public class Q9_replece_ele {
    public static void replace(int arr[],int old,int index){
        for(int i=0;i<arr.length;i++){
            if(i==old){
                arr[i]=index;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int index = 3;
        int cnew = 10;

        replace(arr,index,cnew);
        
    }
}

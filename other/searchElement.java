import java.util.Scanner;

public class searchElement {
   public static int search_Ele(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }

        return search_Ele(arr, key, i+1);
        }


    public static void main(String[] args){
        int arr[]={1,2,3,5};
        int key=5;
        System.out.println(search_Ele(arr,key,0));
       
    }
}

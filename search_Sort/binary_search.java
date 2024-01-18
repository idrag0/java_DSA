package search_Sort;
public class binary_search {
    public static int check(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;

        while(start<=end){
            if(arr[mid]==key){
                return arr[mid];
            }
            if(mid<key){
                start=mid+1;

            }
            else{
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
        return -1;
}
    public static void main(String args[]){
        int arr[]={2,3,4,5234,4,64,7};
        int key=64;

        if(check(arr,key)==key){
            System.out.println("Element found "+ check(arr, key));
        }
        else{
             System.out.println("Element not found");
        }
       

    }
}

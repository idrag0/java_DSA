package search_Sort;
public class bubble_sort {

    public static void Bsort(int arr[]){
        int temp;
        int n=arr.length-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(arr[j+1]<arr[j]){
                //swap
                temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String args[]){
        int arr[]={4,2,3,1,8,5,6,7};

        Bsort(arr);
    }
}

package search_Sort;

public class selection_Sort {
    public static void Ssort(int arr[]){
        int temp;
        for(int i=0;i<arr.length-1;i++){
            int midpos=i;
            for(int j=i+1;i<arr.length;j++){
                if(arr[midpos] > arr[j]){
                    midpos=j;
                }
            }
            //swap
            temp=arr[midpos];
            arr[midpos]=arr[i];
            arr[i]=temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={4,5,2,6,1};

        Ssort(arr);
    }
}

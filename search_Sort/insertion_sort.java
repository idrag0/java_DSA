package search_Sort;

public class insertion_sort {
    public static void Insort(int arr[]){

        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j--;
                
            }
            arr[j+1]=key;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,4,6,7,2};
        Insort(arr);

    }
}

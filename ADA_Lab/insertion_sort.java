package ADA_Lab;
//6,3,5,7,2,4
public class insertion_sort {
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            
            while(j>=0 && arr[j]>key){
                if(arr[j+1]>arr[j]){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=key;
            }
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }

    public static void main(String args[]){
        int arr[]={6,3,5,7,2,4};
        insertion(arr);
    }
}

package ETE_Exam.MTE_EXAM;

public class selectionSort {
    public static void Selection(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            int midpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[midpos]>arr[j]){
                    midpos=j;
                }
            }
            //swap
            int temp=arr[midpos];
            arr[midpos]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
}

    public static void main(String[] args) {
        int arr[]={4,2,3,1,8,6,7};

        Selection(arr);
    }
}

package exam_practise;

public class sort {
    public static void bubble(int arr[]){
        int temp;
        int n=arr.length-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                //swap
                if(arr[j+1]<arr[j]){
                     temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp; 
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void Selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int midpos=i;
            for(int j=i+1;j<arr.length;j++){
               if(arr[midpos]>arr[j]){
                 midpos=j;
               }
            }
            int temp=arr[midpos];
            arr[midpos]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void insertion(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={4,2,3,1,8,6,7};
        System.out.println("Selection : ");
        Selection(arr);
        System.out.println("Bubble Sort: ");
        bubble(arr);
        System.out.println("insertion sort: ");
        insertion(arr);
    }
}

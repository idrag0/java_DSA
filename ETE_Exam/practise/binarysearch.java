package ETE_Exam.practise;

public class binarysearch {
      public static boolean binarySear(int arr[],int key){
        int s=0;
        int e=arr.length;
        int mid = s+(e-s)/2;

        while(s<e){
            if(arr[s]==key){
                return true;
            }

            if(arr[mid]<key){
                s=mid+1;
            }else{
                e=mid-1;
            }
            mid=s+(e-s)/2;

            return false;
        }

      }

      public static void main(String args[]){
        int arr[]={2,3,5,1,9,6,4};

        System.out.println(binarySear(arr, 5));
        
    }
}

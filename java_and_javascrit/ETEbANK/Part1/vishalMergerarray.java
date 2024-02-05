import java.lang.reflect.Array;
import java.util.*record;
public class vishalMergerarray {
    public static int[] mergeArr(int arr1[],int arr2[]){
        int n=arr1.length;
        int m=arr2.length;

        int newArr[]=new int[n+m];

        int k=0;
        for(int i=0;i<n;i++){
            newArr[k]=arr1[i];
            k++;
        }

        for(int i=0;i<m;i++){
            newArr[k]=arr2[i];
            k++;
        }

        return newArr;
    }

    public static void main(String args[]){
        int arr1[]={1,65,3,4,5};
        int arr2[]={6,7,8,9,10};

        int newArr[]=mergeArr(arr1,arr2);
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }
}

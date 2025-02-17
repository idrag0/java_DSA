
package ADSA_revusi;


public class KthSmall_largeElement {
    public static void kth(int arr[], int k) {
        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j=0; j<n-i; j++){
                if(arr[j+1] < arr[i]){
                    
                }
                
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ "  ");
        }
        int small = arr[k-1];
        int large = arr[n-k];

        System.out.println("Kth smallest element is " + small);
        System.out.println("Kth largest element is " + large);
    }

    public static void main(String[] args) {
        int arr[] = {12, 3, 5, 7, 19};
        int k = 2;
        kth(arr, k);
    }
}

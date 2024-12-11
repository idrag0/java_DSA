package leetcode_demo;

public class q1497_arraypair {
    public boolean canArrange(int[] arr, int k) {
        int count=0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum = arr[i]+arr[j];
                if(sum%k ==0){
                    count++;

                }
             } 
        }

        System.out.println("Count: " + count);
        return (count >= n/2) ? true : false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,10,6,7,8,9};
        int k = 5;
        
        q1497_arraypair obj = new q1497_arraypair();
        boolean result = obj.canArrange(arr, k);
        
        System.out.println("Result: " + result);
    }
}


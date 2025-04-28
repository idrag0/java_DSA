package section_6_sem6.Mte_Assi;

public class leftRightSum {
    
    public static int leftRightSum(int arr[], int l,int r){
        int lsum = 0;
        int rsum = 0;
        int n = arr.length;

        int[] pre = new int[n];
        pre[0] = arr[0];

        for(int i=1; i<n;i++){
            pre[i] = pre[i-1] + arr[i] ;
        }


        if(l==0){
            return pre[r];
        }
        else{
            return pre[r] - pre[l-1];
        }

    }

    public
    static void main(String[] args) {
            int arr[] = {2 ,4 ,5 ,7 ,1 ,3};
            int l = 1;
            int r = 4;
            int res = leftRightSum(arr,l,r);

            System.out.println(res);
        }
}

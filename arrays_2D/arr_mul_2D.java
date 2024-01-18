package arrays_2D;

public class arr_mul_2D {
    
    public static void multi(int arr1[][],int arr2[][]){
        int r1=arr1.length;
        int c1=arr1[0].length;
        int r2=arr2.length;
        int c2=arr2[0].length;

        int ans[][]=new int[r1][c2];

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    ans[i][j]+=arr1[i][k]*arr2[k][j];
                }
        } 
    }
    for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
}

    public static void main(String []args){
        int arr1[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9} };
        int arr2[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9} };

        multi(arr1,arr2);
    }
}


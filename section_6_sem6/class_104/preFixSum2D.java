package class_104;

public class preFixSum2D {
    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int n = mat.length;
        int m = mat[0].length;

        int [][] preSum = new int[mat.length][mat[0].length];
       
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                preSum[i][j] = mat[i][j];

                if(j > 0) preSum[i][j] = preSum[i][j] + preSum[i][j-1];
                if(i > 0) preSum[i][j] += preSum[i-1][j];
                if(i > 0 && j > 0) preSum[i][j] -= preSum[i-1][j-1];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            System.out.print(preSum[i][j] + " ");
            }
            System.out.println();
        }
    }
}

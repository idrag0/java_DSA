package class_104;

public class preRowCol {
    public static void preRow(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;

        int [][] preRowSum = new int[n][m];

        for(int i=0; i<n; i++){
            int currSum = 0;
            for(int j=0; j<m; j++){
                currSum += mat[i][j];
                preRowSum[i][j] = currSum;
            }
        }
        System.out.println("Coloum wise Prefix Sum || horizontal prefix Sum");
        printmat(preRowSum);
    }

    public static void preCol(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;

        int [][] preColSum = new int[n][m];

        for(int i=0; i<n; i++){
            int currSum = 0;
            for(int j=0; j<m; j++){
                currSum += mat[j][i];
                preColSum[j][i] = currSum;
            }
        }
        System.out.println("Row wise Prefix Sum || Vertical prefix Sum");
        printmat(preColSum);
    }


    public static void printmat(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        preCol(mat);
        preRow(mat);
    }
}

public class MatrixTraversal {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int n = matrix.length;
        
        // Print first row from left to right
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[0][i] + " ");
        }
        
        // Print last column from top to bottom
        for (int i = 1; i < n; i++) {
            System.out.print(matrix[i][n-1] + " ");
        }
        
        // Print last row from right to left
        for (int i = n-2; i >= 0; i--) {
            System.out.print(matrix[n-1][i] + " ");
        }
        
        // Print first column from bottom to top
        for (int i = n-2; i > 0; i--) {
            System.out.print(matrix[i][0] + " ");
        }
    }
}

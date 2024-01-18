
public class MatrixSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) { // even row
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] % 2 != 0) { // odd element
                        sum += matrix[i][j];
                    }
                }
            } else { // odd row
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] % 2 == 0) { // even element
                        sum += matrix[i][j];
                    }
                }
            }
        }

        System.out.println("Sum of odd elements in even rows and even elements in odd rows: " + sum);
    }
}

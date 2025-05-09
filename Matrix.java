public class Matrix{
    public static void main(String[] args) {
        int[][] matrix1 = {
            {5, 0, 0},
            {0, 8, 0},
            {0, 0, 3}
        };

        int[][] matrix2 = {
            {5, 1, 0},
            {0, 8, 0},
            {0, 0, 3}
        };

        System.out.println("Matrix 1 is diagonal: " + isDiagonalMatrix(matrix1)); 
        System.out.println("Matrix 2 is diagonal: " + isDiagonalMatrix(matrix2)); 
    }
    public static boolean isDiagonalMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

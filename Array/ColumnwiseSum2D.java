public class ColumnwiseSum2D {
    public static void main(String args[]) {

        int[][] matrix = {
            {1, 2, 3},
            {3, 4, 5},
            {5, 6, 7},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < cols; i++) {

            int colSum = 0;

            for (int j = 0; j < rows; j++) {
                colSum += matrix[j][i];
            }

            System.out.println("Column: " + i + " Sum: " + colSum);
        }
    }
}
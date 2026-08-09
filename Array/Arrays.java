public class Arrays {
    public static void main(String[] args) {

        // Jagged 2D Array
        int[][] brr = {
            {2, 0, 1},
            {5, 6},
            {7, 8, 9, 10}
        };

        // Number of rows
        int rowLength = brr.length;

        // Outer loop -> rows
        for (int rowIndex = 0; rowIndex < rowLength; rowIndex++) {

            // Current row ki length
            int colLength = brr[rowIndex].length;

            // Inner loop -> columns
            for (int colIndex = 0; colIndex < colLength; colIndex++) {

                System.out.print(brr[rowIndex][colIndex] + " ");
            }

            System.out.println();
        }
    }
}
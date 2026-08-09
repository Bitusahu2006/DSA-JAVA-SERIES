public class JaggedArray {
    public static void main(String[] args) {

        
        int[][] arr = new int[4][];

        // Har row ko different size allocate karna
        arr[0] = new int[2];
        arr[1] = new int[5];
        arr[2] = new int[10];
        arr[3] = new int[1];

        // Values assign karna
        arr[0][0] = 10;
        arr[0][1] = 20;

        arr[1][0] = 30;
        arr[1][1] = 40;
        arr[1][2] = 50;
        arr[1][3] = 60;
        arr[1][4] = 70;

        arr[2][0] = 80;
        arr[2][1] = 90;
        arr[2][2] = 100;
        arr[2][3] = 110;
        arr[2][4] = 120;
        arr[2][5] = 130;
        arr[2][6] = 140;
        arr[2][7] = 150;
        arr[2][8] = 160;
        arr[2][9] = 170;

        arr[3][0] = 180;

        // Print array
        for (int rowIndex = 0; rowIndex < arr.length; rowIndex++) {

            for (int colIndex = 0;
                 colIndex < arr[rowIndex].length;
                 colIndex++) {

                System.out.print(arr[rowIndex][colIndex] + " ");
            }

            System.out.println();
        }
    }
}
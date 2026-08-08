public class SolidDiamondPattern {
    public static void main(String args[]) {

        int n = 4;

        // Upper Half
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= (n - row); col++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }

            System.out.println();   // Missing line
        }

        // Lower Half
        
        for (int row = 1; row <= n; row++) {

            if(row ==1){
            continue;
            }

            for (int space = 1; space <= row - 1; space++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
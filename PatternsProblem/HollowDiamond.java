public class HollowDiamond {
    public static void main(String[] args) {

        int n = 5;

        // Upper Half
        for (int row = 1; row <= n; row++) {

            // Part 1 : Spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            // Part 2 : Stars
            if (row == 1) {
                System.out.print("* ");
            } else {

                // Left Star
                System.out.print("* ");

                // Middle Spaces
                for (int col = 1; col <= 2 * row - 3; col++) {
                    System.out.print("  ");
                }

                // Right Star
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower Half
        for (int row = 2; row <= n; row++) {

            // Part 1 : Spaces
            for (int col = 1; col <= row - 1; col++) {
                System.out.print("  ");
            }

            // Part 2 : Stars
            if (row == n) {
                System.out.print("* ");
            } else {

                // Left Star
                System.out.print("* ");

                // Middle Spaces
                for (int col = 1; col <= 2 * (n - row) - 1; col++) {
                    System.out.print("  ");
                }

                // Right Star
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
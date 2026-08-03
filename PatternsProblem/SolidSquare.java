public class SolidSquare {
    public static void main(String args[]){

        int n=4;

        for(int i=1; i<=n; i++){
            // for each row -> n column
            for(int j=1; j<=n; j++){
                // print * star
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

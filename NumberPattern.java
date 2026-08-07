public class NumberPattern {
    public static void main(String args[]){

        int n=4;
        for(int row=1; row<=n; row++){
            //Part-I
            for(int col=1; col<=n-row;col++){
                System.out.print("  ");
            }
            //Part-II
            for(int col=1; col<=row; col++){
                System.out.print(col+" ");
            }
            // part-III
            int RowValue=row;
            int decreseRow=row-1;
            for(int col=1; col<=row-1;col++){
                System.out.print(decreseRow+" ");
                decreseRow--;
            }
            System.out.println();
        }
    }
}

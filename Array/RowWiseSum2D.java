public class RowWiseSum2D {
    public static void main(String args[]){
        int [][] matrix={{1,2,3},{3,4,5},{5,6,7},{7,8,9}};
        int n=matrix.length;
        

        for(int i=0; i<n; i++){
            int rowSum=0;
            for(int j=0; j<n-1; j++){
                rowSum=rowSum+matrix[i][j];
            }
            System.out.println("row: "+i+" RowSum= "+ rowSum);
        }
        
    }
}

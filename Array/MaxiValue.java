public class MaxiValue{
    public static void main(String args[]){
        int [][] matrix={{1,2,3},{3,41,5},{5,6,7},{7,8,9}};
        int max=matrix[0][0];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }
        }
         System.out.println("maximum number is:"+max );

    }
}
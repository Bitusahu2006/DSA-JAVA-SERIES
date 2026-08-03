public class InvertedRightAngleTrangle {
    public static void main(String args[]){
        
        int n=5;

        for(int row=1; row<=n; row++){
            //for each row -> variable column 
            for(int col=1; col<=n+1-row;col++){
                // star
                System.out.print("* ");
            }  
            System.out.println();
        }

    }
}

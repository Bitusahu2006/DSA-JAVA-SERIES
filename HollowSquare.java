public class HollowSquare {
    public static void main(String args[]){

        int n=5;
        for(int row=1; row<=n; row++){
            // for each row -> 6 columns
            for(int col=1; col<=6; col++){

                if(row==1 || row==n){
                    System.out.print("* ");
                }
                else{
                    //middle row
                    if(col == 1){
                        System.out.print("* ");
                    }
                    else if(col==6){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            
            }
            System.out.println("");
        }
    }
}

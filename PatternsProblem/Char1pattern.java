public class Char1pattern {
    
    public static void main(String args[]){

        int n=5;

        for(int row=1; row<=n; row++){

            for(int col=1; col<=row; col++){
                // int d=n-col;
                int a=col;
                int b=('G'-1);
                // int b=a+d;
                int c = b-a;
                char finalAns=(char)c;
                // System.out.print(finalAns+" ");
                System.out.print(finalAns+" ");
            }
            System.out.println();
        }
    }
}

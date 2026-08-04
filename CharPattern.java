public class CharPattern {
   
    public static void main(String args[]){
        int ch=5;
        // int count =1;

        for(int row=1; row<=ch; row++){

            for(int col=1; col<=row; col++){
                
                int a = col;
                int b= ('A'-1);
                int ans = a+b;
                char finalAns=(char)ans;
                System.out.print(finalAns+" ");
            
            }
            System.out.println();
        }
    }
}



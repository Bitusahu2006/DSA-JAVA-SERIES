public class SolidRombus {
    public static void main(String args[]){
        int n=5;
        
        for(int row=1; row<=n; row++){
            // for each row ->  space, star

            // space
            for(int space=1; space<=(n-row);space++){
                System.out.print(" ");
            }
            // star
            for(int star=1; star<=n;star++){
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }
}

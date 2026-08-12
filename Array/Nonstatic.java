public class Nonstatic {
    
    int sum(int a, int b){

        int c=a+b;
        return c;
        
    }
    public static void main(String args[]){
        int a=9;
        int b=10;
        Nonstatic n=new Nonstatic();
        System.out.print(n.sum(a,b));
    }
}

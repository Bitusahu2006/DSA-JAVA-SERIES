public class LCM {

    public static int findLCM(int a, int b){
        
        int Originala=a;
        int Originalb=b;
        
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
            
        }
        return (Originala*Originalb)/a;
    }
    public static void main(String[] args){

        System.out.print(findLCM(4,3));
    }
}

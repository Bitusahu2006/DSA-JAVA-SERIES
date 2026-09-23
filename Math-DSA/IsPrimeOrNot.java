public class IsPrimeOrNot {

    public static boolean IsPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2; i<=num-1;i++){
            if(num%i==0){
                return false;
            }
            
        }
        
       return true;
    }
    public static void main(String [] args){
        System.out.print(IsPrime(9));
    }
}

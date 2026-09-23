public class OtimalIsprime {
    public static boolean IsPrimeorNot(int num){
        for(int i=2; i*i<=num; i++){
            if(num%i==0){
                return false;
            }
        }return true;
    }
    public static void main(String [] args){
        System.out.print(IsPrimeorNot(10));
    }
}

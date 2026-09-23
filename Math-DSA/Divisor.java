public class Divisor {
    public static void findDivisor(int num){

        for(int i=1; i<=num;i++){
            if(num%i == 0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){

        findDivisor(6);
    }
}

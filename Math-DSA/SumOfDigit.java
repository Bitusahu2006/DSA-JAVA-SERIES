public class SumOfDigit{
    public static void sumof_digit(int n){
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum+=digit;
            n=n/10;
        }
        System.out.print("Sum of digit :"+sum);
    }
   public static void main(String args[]){
        int n=12345;
         sumof_digit(n);

    }
}
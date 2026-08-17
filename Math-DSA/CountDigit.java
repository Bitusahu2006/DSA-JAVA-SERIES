public class CountDigit {
    public static void countDigit(int num){
        int count =0;

        while(num!=0){
            // int digit=num%10;
            count++;
            num=num/10;
        }
        System.out.print("Count of digit in a number: "+count);
    }
    public static void main(String[] args){
         countDigit(15317258);
         
    }
}

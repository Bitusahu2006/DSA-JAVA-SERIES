public class reverseofNum {
    public static void ReveseOfNumber(int num){
        // while(num!=0){
        //     int digit= num%10;
        //     System.out.print(digit+"");
        //     num=num/10;
        // }

        int reverseNum=0;
        while(num!=0){
            int digit=num%10;
             reverseNum=(reverseNum*10) + digit;

            num=num/10;
        }
        System.out.print(reverseNum);
        

    }
   public static void main(String[] args){
    int n=1498;
    ReveseOfNumber(n);
   } 
}

public class ArmstrongNumber {
    public static int findArmstrong(int num){
        int ans=0;
        while(num!=0){
            int digit=num%10;

            int cube= digit*digit*digit;
            ans=ans+cube;
            num=num/10;
        }
        return ans;
    }
    public static void main(String [] args){
        int num=121;
        int n=findArmstrong(num);
        if(num==n){
            System.out.println(num+" is aarmstrong number");
        }else{
            System.out.print(num+" Not a armstrong number");
        }
        

    }
}

public class FindPefectNUmber {
    public static int findPerfectNum(int num){
        int sum=1;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                sum+=i;
                
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int num=6;
        int ans= findPerfectNum(num);

        if(num==ans){
            System.out.print("Input number is perfect number");
        }else{
            System.out.print("Not perfect number");
        }
    }
}

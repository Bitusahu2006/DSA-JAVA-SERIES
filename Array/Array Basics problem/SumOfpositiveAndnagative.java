public class SumOfpositiveAndnagative {
    static int[] SumOfPosAndNegNum(int[] arr){
        int size=arr.length;
        int positive=0;
        int negative=0;
        for(int i=0; i<size; i++){
            if(arr[i]>=0){
                positive+=arr[i];
            }else{
                negative+=arr[i];
            }
        }
        int ans[]={positive,negative};
        return ans;

        // System.out.println("Sum of Positive Number is:"+positive);
        // System.out.println("Sum of Negative Number is:"+negative);
    }
    public static void main(String[] args){
        int arr[]={10,20,-30,50,-70,80,-20};
        int ans[]=SumOfPosAndNegNum(arr);

        System.out.println("Positive Sum: "+ans[0]);
        System.out.println("Negative Sum: "+ans[1]);
        
    }
}

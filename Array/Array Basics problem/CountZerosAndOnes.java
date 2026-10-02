public class CountZerosAndOnes {
    static int[] getZerosAndOnes(int arr[]){
        int size=arr.length;
        int countZero=0;
        int countOnes=0;

        for(int i=0; i<size; i++){
            if(arr[i]==0){
                countZero++;
            }else{
                countOnes++;
            }
        }
        int ans[]={countZero,countOnes};
        return ans;
    }
    public static void main(String [] args){
        int nums[]={0,1,0,0,1,1,0,1,0,0};
        int ans[]=getZerosAndOnes(nums);
        System.out.println("Count of Zeros: "+ ans[0]);
        System.out.println("Count of Ones: "+ ans[1]);
    }
}

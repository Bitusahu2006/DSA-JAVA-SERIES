public class ShiftElementByOne {
    static void RightShiftByOne(int nums[]){
        int n=nums.length;
        int last=n-1;
        int secLast=n-2;
        int temp=nums[last];
        
        for(int i=0; i<n-1;i++){
            nums[last]=nums[secLast];
            last--;
            secLast--;
        }
        nums[0]=temp;
        for(int k:nums){
            System.out.print(k+" ");
        }
    }
    public static void main(String[] args){
        int nums[]={10,20,30,40,50,60,70,80};
        RightShiftByOne(nums);
    }
}

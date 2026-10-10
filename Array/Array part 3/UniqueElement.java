public class UniqueElement {
    static void getUniqueElement(int[] nums){
        int n=nums.length;
        int ans=0;

        for(int i=0; i<n; i++){
            ans=ans^nums[i];
        }
        System.out.print("Unique Element of an array is: "+ ans +" ");
    }
    public static void main(String[] args){
        int nums[]={5,2,3,5,3,7,6,7,6};
        getUniqueElement(nums);
    }
}

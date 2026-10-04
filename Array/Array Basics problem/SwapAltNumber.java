public class SwapAltNumber {
    static void getSwapping(int nums[]){
        int size=nums.length;
        for(int i=0; i<size-1;i+=2){
            int temp=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;
            // i+=1;
        }
    }
    public static void main(String[] args){
        int num[]={1,2,3,4,5,6};
        System.out.println("Original Arrays");
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();

        System.out.println("After Swapping");
        getSwapping(num);
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
    }
}

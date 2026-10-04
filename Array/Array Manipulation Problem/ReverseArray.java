public class ReverseArray{
    static void getReverse(int nums[]){
        int size=nums.length;
        int st=0;
        int end=size-1;
        while(st<=end){
            int temp=nums[st];
            nums[st]=nums[end];
            nums[end]=temp;
            st++;
            end--;

        }
        System.out.println("Reverse array are:");
        for(int k:nums){
            System.out.print(k+" ");
        }

    }
    public static void main(String[] args){
        int arr[]={10,20,30,40,50,60};
        System.out.println("Original array are:");
        for(int k:arr){
            System.out.print(k+" ");
        }
        System.out.println();
        getReverse(arr);
    }
}
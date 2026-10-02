public class MaximumElement {
    static int MaxiElement(int nums[]){
        int size=nums.length;
        int maxi=nums[0];
        for(int i=0; i<size; i++){
            maxi=Math.max(maxi, nums[i]);
        }
        return maxi;
    }
    static int MaxElement(int [] arr){
        int size=arr.length;
        int max=arr[0];
        for(int i=0; i<size; i++){
            if(max < arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String [] args){
        int arr[]={10,20,50,30,40};
        System.out.println("Max Element is :"+ MaxElement(arr));
        int nums[]={10,20,50,30,40,60,90,25};
        System.out.println("Max Element is :"+ MaxiElement(nums));

        
    }
}

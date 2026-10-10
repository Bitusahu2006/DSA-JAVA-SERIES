public class Sort0and1{
    static void getSortZerosandOnes(int[] arr){

        int n=arr.length;
        int st=0;
        int end=n-1;
        while(st<end){
            if(arr[st]==1 && arr[end]==0){
                int temp=arr[st];
                arr[st]=arr[end];
                arr[end]=temp;
    
            }
            if(arr[st]==0){
                st++;
            }
            if(arr[end]==1){
                end--;
            }
        }
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int nums[]={1,0,0,1,1,0,1};
        getSortZerosandOnes(nums);
    }
}
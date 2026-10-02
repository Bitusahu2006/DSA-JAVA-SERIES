public class LinearSearch {
    static boolean FindTargetElement(int[] arr, int target){
        int size=arr.length;
        for(int i=0; i<size; i++){
            if(arr[i]==target){
                return true;
                
            }
        }
        return false;
    }
    public static void main(String [] args){
        int arr[]={4,3,7,9,6};
        int target=7;
        System.out.print(FindTargetElement(arr,target));
    }
}

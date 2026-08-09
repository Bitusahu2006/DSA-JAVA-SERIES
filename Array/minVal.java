public class minVal {

    public static void MinValue(int arr[]){

        int n= arr.length;

        int MinVal=arr[0];

        for(int i=0; i<n; i++){
            if(arr[i]<MinVal){
                MinVal=arr[i];
            }
        }
        System.out.print("Minimum value of in an array is: "+ MinVal);
    }
    public static void main(String args[]){
        int arr[]={2,3,-4,32,41};
        MinValue(arr);
    }
}

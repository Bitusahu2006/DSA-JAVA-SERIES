public class ReveseNumber{
    public static void reverseArray(int arr[]){
    
        int n=arr.length;
        //temp array-> to store copy of the array in reverse order
        int temp[]=new int[n];

        for(int i=0; i<n; i++){
            temp[i]=arr[n-i-1];
        }
        

        for(int i=0; i<n; i++){
            arr[i]=temp[i];
        }



   }

    public static void main(String args[]){

        int arr[]={1,4,3,2,6,5};
        int n=arr.length;

        reverseArray(arr);
        System.out.print("Revese array are: ");

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        

    }
}
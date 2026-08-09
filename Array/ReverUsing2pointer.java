public class ReverUsing2pointer {
    public static void towpointerAproach(int arr[]){

        int n=arr.length;
        int st=0; 
        int end = n-1;

        while(st<end){

            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
            
        }


    }

    public static void main(String args[]){

        int arr[] = {1,4,3,2,6,5};

        towpointerAproach(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }
}

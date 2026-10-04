public class printAlternateNumber {
    static void GetAlternativeNum(int [] arr){
        int n=arr.length;
        int st=0;
        int end=n-1;
        while(st<=end){
            if(st==end){
                System.out.print(arr[st]);
                return;
            }else{
            System.out.print(arr[st]+" ");
            st++;
             System.out.print(arr[end]+" ");
             end--;
            }

        }

    }
    public static void main (String [] args){
        int arr[]={1,2,3,4,5};
        GetAlternativeNum(arr);
    }
}

public class MultiplyBy10 {
    static int[] MultiWithTen(int[] arr){
        int size=arr.length;
        int newArr[]=new int[size];

        for(int i=0; i<size; i++){
            int element=arr[i];
            int newElement=element*10;
            newArr[i]=newElement;
        }
        return newArr;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4};

        int newArray[]=MultiWithTen(arr);

        for(int i:newArray){
            System.out.print( i+" ");
        }
    }
}

public class SumOf2DMatrix {
    public static void sumMatrix(int arr[][]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            
            for(int j=0; j<arr[i].length; j++){
                int value= arr[i][j];
                sum+=value;
            }
        }
        System.out.print("Sum of matrix is : "+ sum);
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        sumMatrix(arr);
    }
}

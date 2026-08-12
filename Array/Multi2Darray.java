public class Multi2Darray {
    public static void main(String args[]){

        int ans=1;
        int arr[][]={{1,2,3},{1,2,3}};

        for(int i=0; i<arr.length; i++){

            for(int j=1;j<arr[i].length; j++){
                int value=arr[i][j];
                ans*=value;
            }
        }
        System.out.print(ans);
    }
}

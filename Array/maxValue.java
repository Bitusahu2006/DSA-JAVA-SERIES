public class maxValue{
    public static void maxValueInarray(int arr[]){

        int n=arr.length;

        int maxVal=arr[0];
        for(int i=0; i<n; i++){
            if(maxVal<arr[i]){

                maxVal=arr[i];
            }
            
        }
        System.out.print("Max Value in an arry is: "+ maxVal);
    }
    public static void main(String[] args){

        int arr[]={4,2,-5,21,15,7};

        maxValueInarray(arr);

    }
}
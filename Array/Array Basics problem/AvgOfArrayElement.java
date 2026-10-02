class AvgOfArrayElement{
    static double AvgElement(int[] arr){
        double sum=0;
        for(int i:arr){
            sum+=i;
        }
        int size=arr.length;
        double avg=sum/size;
        return avg;

    }
    public static void main(String [] args){
        int [] arr={1,3,1,5};

        System.out.println("Avg of array elements is:"+ AvgElement(arr));
    }
}
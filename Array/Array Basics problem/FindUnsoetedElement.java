public class FindUnsoetedElement {
    static int getUnsortedElement(int arr[]){
        int size=arr.length;
        int unsorted_ele=0;
        for(int i=0; i<size-1; i++){
            if(arr[i]<arr[i+1]){
                continue;
            }
            unsorted_ele=arr[i+1];
        }
        return unsorted_ele;
    }
    public static void main(String[] args){
        int nums[]={5,7,11,3,17,21};
        int ans=getUnsortedElement(nums);
        System.out.print("Unsorted element present in an array is: "+ans);
    }
}

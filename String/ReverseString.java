public class ReverseString {
    public static void main(String args[]){
        String str="Bitu Sahu";
        int n=str.length();
        //Original String
        for(int i=0; i<n; i++){
            char ch=str.charAt(i);
            System.out.print(ch+" ");
        }
        System.out.println();
        //Reverse String
        for(int i=n-1; i>=0;i--){
            char ch=str.charAt(i);
            System.out.print(ch+" ");
        }
    }
}

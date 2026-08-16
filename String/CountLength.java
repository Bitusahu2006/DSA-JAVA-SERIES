public class CountLength {
    public static void StringCount(String str){
        int n=str.length();
        int count=0;
        for(int i=0; i<n; i++){
            // char ch=str.charAt(i);
            count++;
        }
        System.out.print("Length of string is: "+ count);
    }
    public static void main(String args[]){
        String name="My name is bittu Sahu";
        StringCount(name);
    }
}

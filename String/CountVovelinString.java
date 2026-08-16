public class CountVovelinString {

    static void CountVovelInString(String str){
        int count =0;
        int n=str.length();
        for(int i=0; i<n; i++){
            char ch=str.charAt(i);
            if(ch=='a'|| ch =='i' || ch =='e'||ch=='o'||ch =='u'||ch=='A'|| ch =='I' || ch =='E'||ch=='O'||ch =='U'){
                count++;
            }
        }
        System.out.print(count);
    }
    public static void main(String args[]){
        String str="My name is bIttu sahu";
        CountVovelInString(str);
    }
}

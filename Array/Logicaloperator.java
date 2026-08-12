public class Logicaloperator {
    
    static String grade(int marks){
        if(marks >=0 && marks<=34){
            return "fail";
        }else if(marks >=35 && marks<=49){
            return "Third class";
        }
        else if(marks>=50 && marks<=79){
            return "Second Grade";
        }
        else if(marks>=80 && marks<=100){
            return "First Grade";
        }
        else{
            return "invalid";
        }
    }
    static String Age(int age){

        if(age<18){
            return "Not Elligible for vote";
        }else if(age>=18 && age<=100){
            return "Elligible for vote";
        }
        else{
            return "Invalid Age";
        }
    }
    public static void main(String args[]){
    //    System.out.print(grade(98));
       System.out.print(Age(19));
    }
}

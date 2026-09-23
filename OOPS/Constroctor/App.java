public class App{
    public static void main(String[] args){
        //default ctor

        // Student A=new Student();
        // A.id=1;
        // A.age=18;
        // A.name="Bitu Sahu";
        // A.nos=50;
        // System.out.println(A.name);
        // System.out.println(A.age);
        // System.out.println(A.id);
        // System.out.println(A.nos);

        // A.bunk();
        // A.study();
        // A.sleep();

        //parameterized constructor
        Student A=new Student(1,23,55,"Bitu Sahu");
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.nos);

        A.bunk();
        A.study();
        A.sleep();

        //copy constructor

        // Student B=new Student(A);
        // System.out.println(B.name);
        // System.out.println(B.age);
        // System.out.println(B.id);
        // System.out.println(B.nos);

        // B.sleep();

    }

}
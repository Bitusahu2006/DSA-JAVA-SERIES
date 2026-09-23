public class Student {
    //Atributes
    public int id;
    public int age;

    public String name;
    public int nos;

    //Default Counstructor
    // public Student(){
    //     System.out.println("Student default ctor called");
    // }
    // Parameterized constructor
    public Student(int id, int age,int nos,String name){
          System.out.println("Student Parameterized ctor called");
          this.id=id;
          this.age=age;
          this.nos=nos;
          this.name=name;
    }
    // Copy Constructor
    public Student(Student srcobj){
        // System.out.println("Student Parameterized ctor called");
          this.id=srcobj.id;
          this.age=srcobj.age;
          this.nos=srcobj.nos;
          this.name=srcobj.name;
    }

    //methods/Behaviors

    public void study(){
        System.out.println(name+" Studying");
    }
    public void sleep(){
        System.out.println(name+" sleeping");
    }
    public void bunk(){
        System.out.println(name+" Bunking");
    }


}

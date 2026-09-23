public class Student {

    // Private attributes
    private int id;
    private int age;
    private String name;
    private int nos;
    private String gf;

    // Parameterized Constructor
    public Student(int id, int age, int nos, String name, String gf) {
        this.id = id;
        setAge(age);
        this.nos = nos;
        this.name = name;
        this.gf = gf;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    // Getter and Setter for number of subjects
    public int getNos() {
        return nos;
    }

    public void setNos(int nos) {
        if (nos >= 0) {
            this.nos = nos;
        }
    }

    // Getter and Setter for gf
    public String getGf() {
        return gf;
    }

    public void setGf(String gf) {
        this.gf = gf;
    }

    // Behaviors
    public void study() {
        System.out.println(name + " is studying");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void bunk() {
        System.out.println(name + " is bunking");
    }
}
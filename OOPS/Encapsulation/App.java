public class App {

    public static void main(String[] args) {

        Student A = new Student(
            1,
            23,
            55,
            "Bitu Sahu",
            "Chatting"
        );

        // Access using getters
        System.out.println("ID: " + A.getId());
        System.out.println("Name: " + A.getName());
        System.out.println("Age: " + A.getAge());
        System.out.println("Subjects: " + A.getNos());
        System.out.println("GF: " + A.getGf());

        // Modify using setters
        A.setAge(35);
        A.setName("Bitu Kumar");

        System.out.println("\nAfter updating:");
        System.out.println("Name: " + A.getName());
        System.out.println("Age: " + A.getAge());

        // Methods
        A.study();
        A.sleep();
        A.bunk();
    }
}
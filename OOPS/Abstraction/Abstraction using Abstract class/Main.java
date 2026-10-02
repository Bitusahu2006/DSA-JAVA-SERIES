abstract class Birds {

    // Abstract methods
    abstract void fly();

    abstract void eat();
}


// Child class 1
class Sparrow extends Birds {

    @Override
    void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    void eat() {
        System.out.println("Sparrow is eating grains");
    }
}


// Child class 2
class Eagle extends Birds {

    @Override
    void fly() {
        System.out.println("Eagle is flying very high");
    }

    @Override
    void eat() {
        System.out.println("Eagle is eating meat");
    }
}


// Main class
public class Main {

    // Static method because main() is also static
    public static void doBirdsStuff(Birds b) {

        b.fly();
        b.eat();
    }


    public static void main(String[] args) {

        // Polymorphism + Upcasting
        doBirdsStuff(new Sparrow());

        System.out.println();

        doBirdsStuff(new Eagle());


        System.out.println("\n--- Upcasting Example ---");

        // Upcasting
        Birds b1 = new Sparrow();

        b1.fly();
        b1.eat();

        System.out.println();

        // Upcasting
        Birds b2 = new Eagle();

        b2.fly();
        b2.eat();
    }
}
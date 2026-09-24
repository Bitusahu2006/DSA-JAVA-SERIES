public class Vehicle {

    // Variables
    public String name;
    public String model;
    public int noOfTyres;

    // Constructor
    Vehicle(String name, String model, int noOfTyres) {
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    // Method
    void startEngine() {
        System.out.println("Vehicle engine started.");
    }

    void stopEngine() {
        System.out.println("Vehicle engine stopped.");
    }
}
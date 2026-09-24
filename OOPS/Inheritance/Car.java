
public class Car extends Vehicle {

    // Variables
    public int noOfDoors;
    public String transmissionType;

    // Constructor
    Car(String name, String model, int noOfTyres,int noOfDoors, String transmissionType) {

        super(name, model, noOfTyres);

        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
    }

    // Method
    void startAC() {
        System.out.println("Car AC started.");
    }
}
public class Main {

    public static void main(String[] args) {

        // Car object
        Car car = new Car(
            "Toyota",
            "Fortuner",
            4,
            4,
            "Automatic"
        );

        System.out.println("Car Name: " + car.name);
        System.out.println("Car Model: " + car.model);
        System.out.println("Tyres: " + car.noOfTyres);
        System.out.println("Doors: " + car.noOfDoors);
        System.out.println("Transmission: " + car.transmissionType);

        car.startEngine();
        car.startAC();
        car.stopEngine();

        System.out.println();

        // Motorcycle object
        Motorcycle bike = new Motorcycle(
            "Yamaha",
            "R15",
            2,
            "Sport",
            "Mono Shock"
        );

        System.out.println("Bike Name: " + bike.name);
        System.out.println("Bike Model: " + bike.model);
        System.out.println("Tyres: " + bike.noOfTyres);
        System.out.println("Handle Bar: " + bike.handleBarStyle);
        System.out.println("Suspension: " + bike.suspensionType);

        bike.startEngine();
        bike.wheelie();
        bike.stopEngine();
    }
}
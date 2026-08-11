package abstraction;

public class InterfaceExample {
    public static void main(String[] args) {
        // Create objects of Car and Bike
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        // Call start() and stop() methods
        myCar.start(); // Calls Car's implementation
        myCar.stop();  // Calls Car's implementation

        myBike.start(); // Calls Bike's implementation
        myBike.stop();  // Calls Bike's implementation
    }
}

package abstraction;

// Class implementing the Vehicle interface
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("The car starts with a key.");
    }

    @Override
    public void stop() {
        System.out.println("The car stops by pressing the brake.");
    }
}

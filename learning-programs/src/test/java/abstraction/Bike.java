package abstraction;

//Another class implementing the Vehicle interface
class Bike implements Vehicle {
 @Override
 public void start() {
     System.out.println("The bike starts with a kick.");
 }

 @Override
 public void stop() {
     System.out.println("The bike stops by pressing the hand brake.");
 }
}

package polymorphism;

//Parent class
class Animal {
 void sound() {
     System.out.println("Animals make different sounds");
 }
}

//Child class
class Dog extends Animal {
 @Override
 void sound() {
     System.out.println("Dog barks");
 }
}

//Another child class
class Cat extends Animal {
 @Override
 void sound() {
     System.out.println("Cat meows");
 }
}

public class MethodOverriding {
 public static void main(String[] args) {
     // Reference of parent class pointing to child objects
     Animal myAnimal;

     myAnimal = new Dog(); // Dog object
     myAnimal.sound(); // Calls Dog's sound()

     myAnimal = new Cat(); // Cat object
     myAnimal.sound(); // Calls Cat's sound()
 }
}


package javabasics;

public class Example38 
{
    //Properties(fields or Data members)
    final String BRAND = "Mahindra"; // Constant
    String model; // Variable
    int year; // Variable
    //Constructor
    Example38(String model, int year) {
        this.model = model;
        this.year = year;
    }
    //Method
    void displayDetails() {
        System.out.println("Brand: " + BRAND + ", Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) 
    {
        // Objects
        Example38 car1=new Example38("XUV500", 2019);
        car1.displayDetails(); 
        Example38 car2=new Example38("Thar", 2020);
        car2.displayDetails(); 
    }
}


package ie.gmit.labweek3;

public class Car {
    //Creating instance variables
    int topSpeed;
    int totalSeats;
    int fuelCapicity;
    String manufacturer;
    String owner;
    float engineSize;
    char carClass;
    float value;

    //Class Methods

    void refuel() {
        
    }

    void park() {

    }

    void drive() {

    }

    void crash() {
        value = 0;
    }
    
    void show() {
        System.out.println("Manufacturer: "+manufacturer);
    }
}
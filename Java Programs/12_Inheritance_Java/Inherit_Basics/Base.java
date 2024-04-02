import java.util.*;

// Implementing the Concept of Inheritance and Differen types of Inheirtance
class Base {
    public static void main(String args[]) {
        Car c1 = new Car();
        c1.on();
        Bicycle b1 = new Bicycle();
        // Printing the number of pedals on bike
        System.out.println(b1.pedals);
    }
}

class Vehicle {
    // The Parent class is also called as Super Class
    // The child class which inherits it gets all it methods as well as attributes
    int speed;
    int wheels;

    void on() {
        System.out.println("This Vehicle is moving ");
    }

    void off() {
        System.out.println("This Vehicle has been Stopped ");
    }
}

class Car extends Vehicle {
    int doors;

}

class Bicycle {
    // As all the Bicycles have fixed number of pedals
    final int pedals = 2;
}

// Inheritance--> It is the mechanism in Java by which one class is allowed to
// inherit the features(fields and methods) of another class. In Java,
// Inheritance means creating new classes based on existing ones.
// A class that inherits from another class can reuse
// the methods and fields of that class.
// In addition, you can add new fields and methods
// to your current class as well.
import java.util.*;

// Implementing the concept of Dynamic Polymorphism (Dynamic Method Dispatch)
public class DynamicPoly {
    public static void main(String args[]){
        // Main Method
        //  Creating a Ref of Parent class point to child class
        Computer obj = new Laptop();
        // In the above case the Reference object is of Parent class But pointing towards the child Class 
        obj.Display();

        // Ref Parent Obect Pointing to Mobile

        obj = new Mobile();

        obj.Display();
    }
}


// In java poly --> 1. Static (Overloading )  2. Dynamic (Run time Polymorphism )
// Dynamic Polymorphism can be implemented using the concept of inheritance 
//  When ref of Parent class make the object of child class --> Dynamic Polymorphism 
// We can keep on changing the use case of the superclass object as per needs

class Computer{
    void Display(){
        System.out.println("Hello this is A Computer !");
    }
}
// Note that here Mobile and Laptop are Child Classes 

class Mobile extends Computer{
 // Method Overiding 
 void Display(){
    System.out.println("This is aslo a Computer But it is Mobile");
}
}

class Laptop extends Computer {
    // Method Overiding 
    void Display(){
        System.out.println("This is also a Computer But it is Laptop");
    }
}
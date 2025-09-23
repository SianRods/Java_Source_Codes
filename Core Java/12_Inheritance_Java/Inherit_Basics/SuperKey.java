import java.util.*;

// Implementing the Concept of Super Keyword in Java
// Super Refers to the immediate Parent class of an object in java  
public class SuperKey {
    public static void main(String args[]){
        // Creating an object of the child class 
        Child c1 = new Child("Sian", "Dominic", 56);
        // Printing the attributes of the parent class constructor using the child class 
        System.out.println(c1.name);

    }
}

class Parent {
    // Creating Constructor to take inputs 
    String name ;
    int age ;
    Parent(String name, int age ){
        this.name= name ;
        this.age =age ;
        System.out.println("This is the Constructor of the Parent Class ");
    }
}

// Here it is important to note that as the child class inherits the Parent class all the 
//  Attributes as well as constructors of the parent class are inherited by the child class 

class Child extends Parent{
    String child_name;
    Child(String child_name,String name , int age ){
        // Using the super keyword to directly pass the 'name ' and 'age ' value to the parent class constructor 
        super(name ,age);
        // using the personal attribute of child class to intialize it 
        this.child_name= child_name; 

    }
}


// FOOT NOTES --> USES OF THE KEYWORD SUPER 
/*Call superclass methods
Access the superclass constructor
Eliminate the confusion between superclasses and subclasses that have methods with the same name
Access members (fields or methods) of the superclass that have been overridden in the subclass
Access the data members of the immediate parent class
Invoke the overridden methods of the immediate parent class
Call both default and parameterized constructors of the immediate parent class
Access attributes, methods and constructors of the immediate parent class from the child class
Call a method defined in the superclass
 * 
 */
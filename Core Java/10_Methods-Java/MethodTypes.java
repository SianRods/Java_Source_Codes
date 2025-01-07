import java.util.*;

// Implementing method overiding and Different Types of Methods
// It  is important to note that method overiding can only be acheived with inheritance
class MethodTypes {
    public static void main(String args[]) {
        // Here the main methods is static and hence cannot be overidden
        // Similarly here the use of 'this ' and 'Super' keyword is not allowed
        //  Implementing the static method without an object of the class operations 
        Operations.add(2, 3);
    }

}

class Operations {
    // Creating one more static method
    static void add(int a, int b) {
        System.out.println("Hello World");
    }
}

// FOOT NOTES --> Types of Methods In JAVA
/*
 * Static Methods
 * 1. Its is a Part of the Class and are not tied to specific Instance of class
 * 2.They can be accessed using the class name --> ClassName.StaticMethod();
 * 3.A static method can call other static methods directly, without using an
 * object
 * 4.A static method can be used to create utility and helper classes that do
 * not require objects
 * 5.A static method can access and modify static variables (class variables)
 * without using
 * the class's object (instance)
 * 
 * Remember
 * 1. A static variables cannot access non - static variables or call Non static
 * methods directly
 * 2. They cannot use the 'this' or 'super ' keyword --> as they refer to
 * current object
 * and parent class respectively
 * 3.A static method cannot be abstract, final, synchronized, or native
 * 4.A static method cannot be overridden by a subclass, as it is bound to the
 * class at compile time
 * 
 * NOTE --. Static methods cannot be overidden by a subclass
 * 
 * NON-STATIC METHODS -->
 * 1.Those which require objects in order to access them
 */
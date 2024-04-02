import java.util.*;
// Implementing the Concept of Methods in Java Just Like Functions in C
public class MethodsJava {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x ,  y;
        System.out.println("Enter any two numbers : ");
        x=sc.nextInt();
        y=sc.nextInt();
        // Passing the arguments to the function 
        add(x,y);
        // Creating an Object of the class opereations
        Operations o1 = new Operations();
        // Accessing the method using the object
        o1.Add(x, y);
        o1.Sub(x, y);
        o1.Mul(x, y);
        o1.Div(x, y);
        // Checking the Vlaues in Instance Variables 
        o1.PrintVaribles();
    }

    // Creating a Add Method Within the Parent Class of Main Method 
    // Here the use of keyword static is essential as only for static keyword we can access the function 
    //  within the same parent class without creating an object unecessarilynn
static void add (int a , int b){
    //  Also for showing (a+b) --> The Brackets are important 
    System.out.println("The addition of both the number is : "+(a+b));
}
}

// Creating a Separate class and its function and accessing it by using/ Creating an object 

class Operations {
    // There are four types of Variables in Java Depending upon their use case as well as memory
    /*
     *  1) Local Variable -->  Restricted to a block of a Code only 
     *  2) Instance (Non Static ) Varibles--> These are variable copies of which are Created each time an object 
     *     of class is made 
     *  3) Static Varible--> Also called as class variables only one copy exists and are related to class  
     */

    //  Creating an Instance Variables 

    int a;
    int b;

    //  A copy of a&b will be created everytime an object of the class 'Operations ' is made
    
    /*
     * Constructors in Java Are Special Methods which are used to initialize varibles of a class 
     *  and assign them proper attributes . 
     * 1) Name of constructor --> Same as that of the Class 
     * 2) Return Type --> They Do not have any return type not even void 
     * 3) Parameters --> Constructors are Parameterized and hence they can be overloaded(Static Polymorphism)--
     * cont. Just like the other methods can be overloaded .
     * 4) Multiple Constructors --> Given Class may have multiple constructors 
     */

     void Add(int x,int y){
        // a=x;
        // b=y;
        System.out.println("The addition of the Two number is : "+(x+y));
     }

     void Sub(int x,int y){
        // a=x;
        // b=y;
        System.out.println("The Subtraction of the Two number is : "+(x-y));
     }

     void Mul(int x,int y){
        // a=x;
        // b=y;
        System.out.println("The Multiplication of the Two number is : "+(x*y));
     }

     void Div(int x,int y){
        // a=x;
        // b=y;
        System.out.println("The Division of the Two number is : "+(x/y));
     }

      void PrintVaribles(){
        System.out.println(a);
        System.out.println(b);
     }
}

// FOOTNOTES --> USING 'this ' KEYWORD 
/* In Java, 'this' is a reference variable that refers to the current object of a class 
 *  Some of the properties of the this keyword are as follows 
 *  1)this can be used to refer current class instance variable.
    2)this can be used to invoke current class method (implicitly)
    3)this() can be used to invoke current class constructor.
    4)this can be passed as an argument in the method call.
    5)this can be passed as argument in the constructor call.
    6)this can be used to return the current class instance from the method. 
 */
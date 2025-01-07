import java.util.*;
// Implementing the method overiding 
public class Overiding {
   public static void main(String args[]){
      Animal a1 = new Animal();
      a1.voice();
      // Using Method Overiding 
      Dog d1 = new Dog();
      d1.voice();
   } 
}
class Animal{
   void voice(){
      System.out.println("Animal Says ");
   }
}

class Dog extends Animal{
   void voice(){
      System.out.println("Dog Barks !");
   }
}
/* Method Overiding --> Child classes which inherit the parent classes can overide the methods 
 * of the parent classes to have their own implementation of the the same method 
 * and method overiding is only possible with the help of inheritance 
 *  
 */
 
import java.util.*;
/*
 *  Just like overloading of methods in this we will overload Constructors 
 *   Each Method as well as Constructor have their won unique Signatures --. Which depends upon the no of parameters to be passed as well as the data types of those parameters and hence same name can be used for the mutiple constructors of the class as well as for methods
 
 */

public class Constructor_Overloading {
    public static void main (String args[]){
        DishMaker first = new DishMaker("Pasta", "italiano Sauce");
        DishMaker second = new DishMaker("Tea", "Morning", "Masala Sauce");
    
    }    
}
// Making DishMaker Class 
class DishMaker{
    String name;
    String time;
    String sauce;
    // Constructor 1
    DishMaker(String name , String sauce){
        this.name = name ;
        this.sauce = sauce;
        print1();
    }

    void print1 (){
        System.out.println("Pasta has been initiated ");
    }
    void print2(){
        System.out.println("Tea has been initiated ");
    }
    // Constructor 2
    DishMaker(String name ,String time,String sauce){
        this.name =name;
        this.sauce=sauce;
        this.time=time;
        print2();
    }
}
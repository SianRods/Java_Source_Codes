import java.util.*;
/*--. Header Files
 *  It is important to note that toString() --> is a method which is implicitly executed 
 * when we print the name of instance varible using Syso. Which prints the address of the object 
 * / instance variable however it is possible to print all the attributes as per the wish of 
 * the programmer in the order commanded . But first we will have to overide this method and then
 * we can print all the attributes of an instance variable without having to access each attributes 
 * individually  
 */

public class ToString_Override {
    public static void main(String args[]){
        Car cr = new Car();
        System.out.println(cr); 
    }
}

class Car{
    int year =2024;
    String name ="Buaggati Cheron";
    String color = "Red";
    String price ="$ 3.4 Million ";

    public String toString(){
        String value = name + year+color+price;
        return value;
    }
}
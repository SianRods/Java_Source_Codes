
import java.util.*;

// Implementing the Arrays of an Object 
public class ArrayObjects {
    public static void main(String args[]) {
        // Creating objects of the Cars CLass
        cars c1 = new cars("porchse", "Black", "$5000000");
        cars c2 = new cars("Tesla", "White", "$50000");
        cars c3 = new cars("Lamborghini", "Yellow", "$500000");

        // For creating arrays of an object use the same syntax as that of the array
        // Only in place of data types mention the class of the objects
        // Similarly different methods for arrays can be used to implement the data
        // accordingly

        cars hel[] = { c1, c2, c3 };
        for (int i = 0; i < hel.length; i++) {
            // hel[i] --> denotes an object
            // Therefore hel[i].color --> Denotes the objects Colour
            System.out.println(hel[i].color);
            System.out.println(hel[i].name);
            System.out.println(hel[i].Price);
        }
    }
}

class cars{
    String name ;
    String color;
    String Price;
    cars(String name , String color, String Price ){
        // Using this keyword to initialise the objects attributes 
        this.name=name ;
        this.color=color;
        this.Price=Price;
        System.out.println("This is the Constructor ");
    }
}
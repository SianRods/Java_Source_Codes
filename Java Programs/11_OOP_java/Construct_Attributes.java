import java.util.*;

public class Construct_Attributes {
    public static void main(String[] args) {
        // Creating instance of the class Mobile
        Mobile phone =new Mobile("Xioami","15000","Black Metallic");
        Mobile phone2 = new Mobile("Apple","50000","Purple");
        System.out.println(phone.brand);
        System.out.println(phone2.brand);
        System.out.println(phone2.price);
    }
}


class Mobile{
    String brand;
    String price;
    String color;

    Mobile(String brand,String price,String color){
        // Making use of 'this '--> Keyword
        // Assigning all the unique Attributes 
        this.brand=brand;
        this.color=color;
        this.price=price;
    }

    void welcome(){
        System.out.println("Your have a great device "+this.brand);
    }
}

/*Footnotes --> Constructors in java are special method which are used to creates objects/Instances of  given class with unique attributes 
-->All the necessary parameters must be passed while creating an instance varible of the class through constructor --> Its is important to note that constructor does not return any value void /int/etc. 
-->The name of the Constructor must be used as same as that of the class 
--> In order to access the variables in the class itself in methods we need to use 'this.classname'
--> this keyword to uniquely identify it 
 * w
 */
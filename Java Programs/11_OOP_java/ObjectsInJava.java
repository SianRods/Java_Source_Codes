import java.util.Scanner;
class Shirt{
    // All the below are class variables 
    String color = "Red";
    int size = 40;
    String brand = " US.PA";
    String price = "2499.00";
    void buy(){
        System.out.println("Please try this shirt :");
    }
    void dontbuy(){
        System.out.println("The shirt is  not good dont buy this !! ");
    }
}
public class ObjectsInJava {
    public static void main (String args[]){
        // Creating an instance variable if the class which will have the same attributes as well as methods defined in the class shirt
        // It is also important to note that the number of instances we create of a class will all have same attributes --> to create
        //  a unique attributes for every instance we need to use the constructor
        Scanner sc = new Scanner(System.in);
        Shirt sian = new Shirt();
        System.out.println(sian.brand);
        System.out.println(sian.price);
        System.out.println(sian.color);
        System.out.println("Are you happy with this specs : ??");
        String result =sc.nextLine();
        if(result=="yes"){
            sian.buy();
        } else if(result=="no"){
            sian.dontbuy();
        }
        

    }
}

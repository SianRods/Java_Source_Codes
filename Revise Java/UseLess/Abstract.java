import java.util.*;

public class Abstract {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        SchoolA a1 = new SchoolA();
        SchoolB b1 = new SchoolB();
        a1.Color();
        a1.Pattern();
        boolean record ;
        System.out.println("Is your School SSC if Yes Enter 'true' else enter 'false'");
        record =sc.nextBoolean();
        if(record == true){
            b1.Color();
            b1.ssc(record);
        } else{
            b1.Color();
            b1.Pattern();
        }
    }
}
// Creating Uniform for  Creating applications for Schools 
interface Uniform{
    // If the Inherited Classs is going to pass an Argument through the given
    //  feilds then we have to spcify those arguments in here 
    public void Color();
    public void Pattern();
}

// For a schools A
class SchoolA implements Uniform{
    String color;
    String Pat;
    Scanner sc = new Scanner(System.in);

// As the SchoolA Implements Interface uniform it already has inhereited all its Attributes as well as Methods 
// Overiding the Color
    public void Color(){
        System.out.println("Enter the Color of the Uniform");
        this.color=sc.next();
    }
    public void Pattern(){
        System.out.println("Enter the type of Pattern On your uniform ");
        this.Pat=sc.next();
    }
}

// Implementing the Interface for another group --> School B 
class SchoolB implements Uniform{
    String color;
    String Pat;
    Scanner sc = new Scanner(System.in);

// As the SchoolA Implements Interface uniform it already has inhereited all its Attributes as well as Methods 
// Overiding the Color
    public void Color(){
        System.out.println("Enter the Color of the Uniform");
        this.color=sc.next();
    }
    public void Pattern(){
        System.out.println("Enter the type of Pattern On your uniform ");
        this.Pat=sc.next();
    }

    void ssc(boolean x ){
        if(x==true){
            System.out.println("You Don't Need a Pattern ");
        }
    }
}
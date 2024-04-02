/*
 In java whenever we use same name for different methods it is called as method overloading 
 --. It is allowed in java to name different methods with same name cause methods are differentiated based on method signature which is the combination of the method name + no of parameters involved + data types of those parametes 
---> Importance of the keyword "Static in JAVA"
 */
import java.util.*;


/**
 * overloaded_methods
 */
public class overloaded_methods {
    public static void main(String args[]){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the side of the square :");
        a=sc.nextInt();
        area(a);
        System.out.println("Enter the side of the rectangle :");
        b=sc.nextInt();
        c=sc.nextInt();
        area(b,c);
        System.out.println("Enter the radius and the angle of the Sector :");
        int r;
        double theta;
        r=sc.nextInt();
        theta=sc.nextFloat();
        area(r,theta);
    }
//  Overloading of Methods 
    static void area(int a){
        System.out.println("The area of the given Square is : "+a*a);
    }

    static void area(int a, int b){
        System.out.println("The area of the given rectangle is : "+a*b);
    }
    static void area (int a ,double b){
        System.out.println("The area of the given sector is : "+a*b+"Radians");
    }
    
}
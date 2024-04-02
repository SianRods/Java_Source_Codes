import java.util.*;

import javax.xml.transform.stream.StreamSource;
public class AdditionComplex {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(9,10);
        Complex c3 = new Complex(0, 0);
        System.out.println(c1.real);
        System.out.println(c1.imaginary);
        System.out.println(c2.real);
        System.out.println(c2.imaginary);
        // Creating Two Objects to be added and to be Stored in C3 
        // c3.Add(c1,c2);
        // In the above function when we call the function Add for object C3 
        //  It will automatically Calculte the result for m3 and return a complex objects
        // Then we can store the reurn Complex Object in the C3  as below 
        c3.imaginary=c3.Add(c1, c2).imaginary;
        c3.real = c3.Add(c1, c2).real;
        System.out.println(c3.real);
        System.out.println(c3.imaginary);
        // Or we can directly also print the results 
        // System.out.println(c3.Add(c1, c2).imaginary);
        // System.out.println(c3.Add(c1, c2).real);
    }
}

class Complex{
    int real ;
    int imaginary ;
    Complex(int xreal,int yimag){
        // Creating Unique Attributes for Each Objects
        this.real =xreal;
        this.imaginary =yimag;
    }
    // Creating A method which can take the obejcts of the same class as inputs
    //  and perform the    operations 
    Complex Add(Complex m1, Complex m2 ){
        Complex m3 = new Complex(0, 0);
        m3.real=m1.real +m2.real;
        m3.imaginary =m1.imaginary+m2.imaginary;
        return m3;
    }
}
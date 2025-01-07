import java.util.*;
/*
The Concept Of StringBuffer in String is Similar to the Concept of Arrays and Vector 

 */
public class SringBuffer {
    public static void main(String[] args) {
        // Below is the Only way to initialize the String Buffer Class  Using the New Keyword
        StringBuffer sb1 =new StringBuffer("Sian Rodrigues"); 
        sb1.setCharAt(2, '9');
        sb1.append("Dominic ");
        System.out.println(sb1);
        sb1.insert(5, "Dominic");
        System.out.println(sb1);
    }
}
/*
 Different Types of Methods used are --> 
 obj.append(chracter); --> Appending Another String 
 obj.setCharAt(position,'x'); --. Replacing with new Character 
 obj.insert(position,"String"); --. Inserting New String At Specified Position
 */
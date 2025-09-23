import java.util.Scanner;

// Using Some Important Methods of Strings in Java
public class MethodsInStrings {
    public static void main(String args[]) {
        // Character at Method
        String name = "Sian";
        System.out.println("The character at Method of the string Class " + name.charAt(3));
        // String Length Function /Method of the String Class
        System.out.println("The length of the name string is " + name.length());
        // The substring method to print a Given String within a set limit or from a
        // Mentioned Starting point --> Datatype of a String Itself
        String Sub_String = "Hello world I am Very Happy Today !".substring(3);
        System.out.println("The Substring of the Entered String is :" + Sub_String);
        // indexOf("String") --> Returns the index of Passed Character mentioned in the
        // given string

        name.indexOf("a"); // It is of the Data type int as it returns the index
        System.out.println("The Letter a in my name is " + name.indexOf("a"));

        // To Check if a given String is Empty or not -->It return a boolean Value
        boolean result = name.isEmpty();
        System.out.println("Is my Name Empty : " + result);

        // Conversion of a String to Lower / Upper Case --> Data Type is String 

        String str ="Hello This is Gemini !";
        System.out.println(str);
        System.out.println("All the Characters are now Converted to Upper case Successfully");
        System.out.println(str.toLowerCase());

        // Trim Method can be used for a String to Remove all the unwanted Spaces in a Given String 

        String New="      he   llo w  or ld ";
        String New_Updated = New.trim();
        System.out.println("This is the Older String :\n"+New);
        System.out.println("This is the newer String : \n"+New_Updated);

        // Replacing a given Character with new one using Replace Method --> String Data Type 
        // Replacement will take place on encountering the charater once ==> entountering character once
        name.replace("r", "o");
        System.err.println(name);
        String s1 ="Sian Rodrigues ";
        // Replacing the Character pf String only works for 
        String s2 =  s1.replace('a', 'r');
        System.out.println(s2);
    }
}
/*Footnotes 
String name --> 
1. name.charAt(index);
2. name.length();
3.name.toLowerCase();
4.name.toUpperCase();
5.name.substring(starting_index);
6.name.replace("item to be replaced","to e replced with")

 * 
 * 
 * 
 * 
 */
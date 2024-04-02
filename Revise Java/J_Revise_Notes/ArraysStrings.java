import java.util.*;

// Implementing Arrays and String  
// Array --> Collection of objects of similar types 
// String --> Collection of Characters is Referenced Data Type in Java 
public class ArraysStrings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Different Ways to Intialize a String
        // However it is important to note that only one of the following methods should
        // be used to intialize the strings
        // Way 1st --> String name ="Sian Rodrigues ";
        String name = new String("Sian Rodrigues"); // way 2nd -->
        // Using Different Methods in String Class
        System.out.println(name.length()); // Returns the total length of the string
        // Using the charAt Method to Get Chracter at particular position as output
        for (int i = 0; i < name.length(); i++) {
            // Printing each of the character individually
            System.err.println(name.charAt(i));
        }
        // Using some methods to change the string / edit it
        name.indexOf('s'); // --> Index of first appearance of 's' will be returned
        name.compareTo("Sian Rodrigues"); // --. Compares tWO String and returns Zero for same
        // Note that the cases are considered in the above method to ignore the cases
        // use
        name.compareTo("siAn roDriGueS"); // --> Return an integer value
        name.substring(3); // Kind of an overloaded method where a substring with starting point is
                           // returned
        name.substring(2, 5); // Substring within a Given Limits is returned

        // Arrays in Java
        // way 1 --> Initilise the array int names[] = new int [size];
        // Way 2 --> To initialize the array int names[]={1,2,3,4,5}
        int names[] = { 1, 2, 3, 4, 5 };
        // arrayName.length --> Used the return the size of an array
        // printing the array using the for loops
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            // Arrays in java have same syntax as that of an array in c and can be accessed
            // in similar ways
        }

        // Using the 2-Dimensional Arrays to Store Matrix Information
        // It is necesarry too preintialise the limits of an array before intializing
        // the array itself
        int rows = 3, cols = 3;
        int arr[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) { // Outer loop is always for Rows of a 2D Structure
            for (int j = 0; j < rows; j++) {
                System.out.println("Please Enter the Elements " + (i + 1) + "" + (j + 1));
                arr[i][j] = sc.nextInt();
            }
            // Printing the Above Matrix
            for (int k = 0; k < rows; k++) { // Outer loop is always for Rows of a 2D Structure
                for (int j = 0; j < rows; j++) {
                    System.out.println(arr[k][j]);
                }
            }
        }
    }
}

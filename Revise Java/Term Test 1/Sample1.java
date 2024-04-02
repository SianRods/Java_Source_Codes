import java.util.Scanner;

public class Sample1 {
    // Creating a public main method 
    public static void main(String args[]) {
    //  Creating an instance/ object of the scanner class to access its methods 
    Scanner sc = new Scanner(System.in);
    // By using System.in --> Command to Constructor of the Class Scanner 
    int a ;
    System.out.println("Enter your age ");
    a =sc.nextInt();
    System.out.println("Your age is : "+a);
    
    //  Array is also a referenced Data Types 
    int marks[]= new int[10];
    // Taking input for the Array 
    // Using Array.lenght method return the size of the array 
    for(int i=0;i<marks.length;i++){
        System.out.println("Enter .");
        marks[i]=sc.nextInt();
    }
    // Displaying the array 
    for(int i=0;i<marks.length;i++){
        // Writing only the name of the array will print the address locations 
        System.out.println(marks[i]);
    }
}
}

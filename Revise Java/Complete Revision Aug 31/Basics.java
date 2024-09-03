import java.util.Scanner;

// camel case comvetion 
//  pascal convention

// String, Vector , Arraylist are classes --> Name uses --> Pascal Convention 
//  int , double , float , long , short , char , boolean --> primitive data types in Java
//  String, Vector , Arraylist --> Collections in Java 

public class Basics {
	public static void main(String args[]) {
		// '=' it is assignment opereator
		// new is a keyword --> Memory Allocation / Object creation
		Scanner sc = new Scanner(System.in);
		System.out.println("Revision Java 2.0");

		boolean flag = true;
		System.out.println(flag);

		// using cmd inputs
		// String val1 = args[0];
		// System.out.println(val1);

		// Reading user input till newline character
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println(name);

		// Reading character input using the charAt() Funciton on String
		// sc.next().charAt(0)
		char alpha;
		System.out.println("Enter any Character : ");
		alpha = sc.next().charAt(0);

		// Wrapper Classes can be used to Parse Strings into --> Primitive Data types /
		// Wrapper classes
		System.out.println("Enter any number : ");
		String num = sc.next();
		// print("The Data type of num is currently :",getClass(num));

		// Converting to double using parsing
		// Note that the same number --> num cannot be overwrittten as a double type
		// using parsing
		// num=Double.parseDouble(num); --> Throws error double can't be converted to
		// string

		double new_number = Double.parseDouble(num);
		// System.out.println(getClass(num));

	}

}
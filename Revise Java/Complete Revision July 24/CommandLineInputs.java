
//Command Line Inputs using the Static Main Method 
import java.util.Scanner;

public class CommandLineInputs {

	public static void main(String args[]) {

		// Here we use the Wrapper Class of Integer to Parse the Data Type of String
		// Into the Desired Type

		int number = Integer.parseInt(args[1]);
		System.out.println(number);
		// Use of Wrapper classes in this case 

	}
}
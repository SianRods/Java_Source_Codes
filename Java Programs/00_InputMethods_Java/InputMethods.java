import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner ;

public class InputMethods {
	public static void main (String args[]) throws IOException{
		// Buffered Reader needs an Object of InputStreamReader 
		// And the InputStream need an Object of InputStream 
		//  And then we can properly use the Buffered Reader class for taking the Inputs 
		//  We have to use the Parsing in order to take int, float,double ,eetc 
		InputStreamReader inputObject = new InputStreamReader(System.in);
		BufferedReader bufr = new BufferedReader(inputObject);

		System.out.println("Enter any Number : ");
		int num = Integer.parseInt(bufr.readLine());
		System.out.println(num);
	}
}


// ---------NOTES
//  HERE NOTE THAT THE BUFFERED READER THROWS AN IOEXCEPTION WHICH IS A CHECKED EXCEPTION AND MUST BE NECESSARILY HANDLED 
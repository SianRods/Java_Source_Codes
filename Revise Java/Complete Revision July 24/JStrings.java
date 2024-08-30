import java.util.Scanner;

public class JStrings {

	public static void main(String args[]) {

		String FIRST_NAME = "ALPHA";
		String MIDDLE_NAME = "BRAVO";
		String LAST_NAME = "TANGO ";

	
		FIRST_NAME.charAt(4);
		System.out.println(FIRST_NAME.length());

		System.out.print(FIRST_NAME.equals(new String("ALPHA")));
		System.out.println("\n");
		String EMPTY_TEST = "";
		System.out.println(EMPTY_TEST.isEmpty());
	}

}
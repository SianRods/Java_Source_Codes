import java.util.*;
// ----------------------HEAD NOTES ------------------------------//
// The throws Keyword implies that the checked exception for a called method
// must be necessarily handled
// When we want to explicitly throw an Exception we have to throw an instance of that Exception . i.e object of the Exception 
// must be thrown usng the 'throw ' --> key explicty 

public class PracticeException {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		nameNotEmptyException e = new nameNotEmptyException();
		String one;
		String two;
		String three;

		System.out.println("Enter the First Name : ");
		one = sc.nextLine();
		System.out.println("Enter the Middle  Name : ");
		two = sc.nextLine();
		System.out.println("Enter the Last Name : ");
		three = sc.nextLine();

		try {

			e.getName(one, two, three);
		} catch (nameNotEmptyException n) {
			n.Message();
		}

	}

}

class nameNotEmptyException extends Exception {
	public void Message() {
		System.out.println("Your Name Field Cannot be Left Empty !");
	}

	public String getName(String one, String two, String three) throws nameNotEmptyException {

		if(one.isEmpty() || two.isEmpty()||three.isEmpty()){
			throw new nameNotEmptyException();
		}
		return one + two + three;
	}

}


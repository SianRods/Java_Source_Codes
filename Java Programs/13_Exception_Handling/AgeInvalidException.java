import java.util.Scanner;

public class AgeInvalidException {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the age ??");
			int age = sc.nextInt();
			if (age < 0 || age > 110) {
				throw new ExceptionAge();
			}
		}

		catch (ExceptionAge a) {
			a.printMessage();
		}
	}

}

class ExceptionAge extends Exception {
	public void printMessage() {
		System.out.println("Age cannot be Greater than 110 ot Less than 0 !");
	}
}
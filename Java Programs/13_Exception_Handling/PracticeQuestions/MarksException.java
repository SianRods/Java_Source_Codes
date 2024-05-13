import java.util.*;

class MyException extends Exception {
	
	public void Message() {
		System.out.println("Marks Cannot be Greater than 100 or Less than Zero ");

	}
}

public class MarksException {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int marks;
		try {
			System.out.println("Enter your Marks : ");
			marks = sc.nextInt();
			if (marks > 100 || marks < 0) {
				throw new MyException();
			}
		} catch (MyException e) {
			// TODO: handle exception
			e.Message();
		}

	}
}

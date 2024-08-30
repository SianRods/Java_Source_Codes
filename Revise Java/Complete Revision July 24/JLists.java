import java.util.Scanner;
import java.util.*;

public class JLists {
	public static void main(String args[]) {
		// Vectors and ArrayLists are a Type of Variable
		// Arraylist accepts only Wrapper classes as an input
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.print("Enter the" + (i) + "st Number :");
			list.add(sc.nextInt());
			System.out.print("\n" + list.size());
		}

		System.out.println("Enter the Number you want to Delete : ");
		// Passing all the necessary arguments in a single line
		list.remove(list.get(sc.nextInt()));

		System.out.println(list.size());

		// Implementation of Vectors

		Vector<String> vec = new Vector<>();

		System.out.println("Keep on entering the Data \n To Exit Enter exit");

		System.out.println(vec.capacity());
		while (!vec.contains("exit")) {
			System.out.println("Enter the name : ");
			vec.add(sc.next());
			System.out.println(vec.size());

		}

	}
}
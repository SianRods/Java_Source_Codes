import java.util.Scanner;

public class ArrayJava {
	public static void main(String args[]) {

		// DataTypes ArrayName [] = new Datatypes [ARRAY_SIZE]
		
		int arr[] = new int[2];
		Scanner sc = new Scanner(System.in);

		// Taking Inputs for the Given Array

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Value for the " + (i + 1) + "Element");
			arr[i] = sc.nextInt();
		}

		// Displaying the Array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println(" \n");

		// Using the Two Dimensional Array
		int marks[][] = new int[3][3];

		// Taking the Inputs for the Given Array
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the Details for the " + (i + 1) + "Rows");
			for (int j = 0; j < 3; j++) {
				System.out.println("Enter the " + (j + 1) + "Element of the Rows " + (i + 1));
				marks[i][j] = sc.nextInt();
			}
		}

		// Printing the Given Two Dimensional Array

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(marks[i][j] + "\t");

			}
			System.out.println("\n");
		}

		System.out.println(marks[1].length);

		// Using Jagged Arrays
		int arr1[][] = new int[3][];
		// Arrays Consisting of Three Arrays

		arr1[0] = new int[2];
		arr1[1] = new int[4];
		arr1[2] = new int[1];

		System.out.println(arr1[1].length);

		int score[] = { 1, 2, 3, 4 };
		// Second Method of Initialising the Arrays
		for (int i = 0; i < score.length; i++) {
			System.err.println(score[i]);
		}

	}

}
import java.util.Scanner;

public class JLoops {

	// Static Method
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		JLoops lup = new JLoops();
		int rows = 0;
		int cols = 0;

		System.out.println("Enter the Number of Rows : ");
		rows = sc.nextInt();
		System.out.println("Enter the number of Coloumns : ");
		cols = sc.nextInt();

		lup.lowerTriangle(rows, cols);
		lup.apexPyramid(3, 3);
		lup.rightSidedMatrix(rows, cols);

		int i = 64;
		System.out.println();
	}

	// Lower Triangle Method
	
	public void lowerTriangle(int rows, int cols) {

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j + 1);
			}
			System.out.println();
		}

	}

	// Pyramid Triangle

	public void apexPyramid(int rows, int cols) {
		for (int i = 1; i <= rows; i++) {
			for (int j = cols; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.print("\n");

		}

	}

	// RightTriangular Matrix

	public void rightSidedMatrix(int rows, int cols) {
		for (int i = 1; i < rows; i++) {
			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}

			System.out.print("\n");
		}

	}

	// leftAlphabeticalMatrix

	public void leftAlphabetMatrix(int rows, int cols) {
		for (int i = 1; i < rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("%c" + (i + 1));
			}
			System.out.print("\n");
		}

	}

	// rightsidedAlphabeticalMatrix

	public void rightsidedAlphabeticalMatrix(int rows, int cols) {
		for (int i = 1; i <= rows; i++) {
			// Printing the Blank Spaces
			for (int j = cols; j > i; j--) {
				System.out.print(" ");
			}
			// Printing Chracters

			for (int k = i; k <= rows; k++) {
				System.out.print(k);
			}
		}
	}

}
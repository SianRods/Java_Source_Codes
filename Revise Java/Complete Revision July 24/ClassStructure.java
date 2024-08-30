import java.util.Scanner;

public class ClassStructure {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Solution s1 = new Solution(0, 0);
		System.out.println("Enter the real part");
		s1.real = sc.nextDouble();

		System.out.println("Enter the Imaginary part");
		s1.imaginary = sc.nextDouble();

		System.out.println(s1);

		s1.addComplex(new Solution(4, 5));
		System.out.println(s1);

	}
}

class Solution {

	public double imaginary;
	public double real;

	public Solution(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public Solution addComplex(Solution s1) {
		this.real = s1.real + this.real;
		this.imaginary = s1.imaginary + this.imaginary;

		return new Solution(this.real, this.imaginary);
	}

	@Override
	public String toString() {
		return this.real + "+i" + this.imaginary;
	}

}
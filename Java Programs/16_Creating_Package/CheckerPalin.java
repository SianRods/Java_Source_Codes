
import java.util.Scanner;

import PallindromeChecker.Palindrome;

public class CheckerPalin {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String chk = sc.nextLine();
		Palindrome p1 = new Palindrome(chk);
		p1.palin();
	}
}

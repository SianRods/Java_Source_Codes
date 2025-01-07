
package PallindromeChecker;
import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {
	public boolean flag;
	public String str;

	public Palindrome(String str) {
		this.str = str;
	}

	public void palin() {

		for (int i = 0; i < (str.length() - 1) / 2; i++) {
			for (int j = str.length() - 1; j > str.length() / 2; j--) {
				if (str.charAt(i) == str.charAt(j)) {
					flag = true;
				} else {
					flag = false;
					break;
				}

			}
		}
		if (flag) {
			System.out.println("String is a Pallindrome !");
		} else {
			System.out.println("String is not Pallindrome !");
		}

	}
}

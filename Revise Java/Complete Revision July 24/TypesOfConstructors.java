import java.util.Scanner;

public class TypesOfConstructors {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Solution s ;
		// Depending Upon the users we will instantiate using a particular constructor 
		System.out.println("Are you aware about the nature and name of your porblem ??");
		if (sc.nextBoolean()) {
			new Solution(true);
		} else {
			 new Solution(2, "NameConstructor");
		}
		
	}
}

// Method Overloading / called as Static Polymorphism can also be acheived by
// using Constructors

class Solution {
	public int level;
	public String Name;
	public boolean status;

	public Solution() {
		// Non Paramaterised Constructor
	}

	public Solution(int level, String name) {
		this.level = level;
		Name = name;
		System.out.println("This is the Name Constructor !");
	}

	public Solution(boolean status) {
		this.status = status;
		System.out.println("This is the Status Constructor !");
	}

}
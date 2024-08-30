import java.util.Scanner;

public class SuperKey {
	public static void main(String args[]){
		ParentA a1 = new ParentA("True Shit");
		System.out.println("Above is the Constructor of A ");

		ChildB b1 = new ChildB(24);

	}
}

// Super Key Word Demonstration using the Multilevel Inheritance
// All the Classes in Java By Default inHerit the child class
// Calling all of its immediate Parent Constructors  

class ParentA {

	public ParentA(String familia) {
		System.out.println("This is the Constructor of the Parent A :"+familia);
	}

	public ParentA(char letter){
		System.out.println("The Chracter you have Entered if ");
	}
	// Empty Construtor 
	public ParentA(){
		System.out.println("This is an Empty Constructor of the Class A");
	}

}

class ChildB extends ParentA {

	public ChildB(int num) {
		super();
		// super("Noah Arch");
		System.out.println("This is the Constructor of the ChildB");
	}

}

class ChildC extends ChildB {

	public ChildC(String name, boolean status) {
		super(25);
		System.out.println("This is the Constructor of the ChildC");
	}

}
import java.util.Scanner;

public class InheritanceJava {
	public static void main(String args[]) {
		// Using the Concept oFf Dynamic Method Dispatch / Compile Time Polymorphism Where the Arguments are resolved while Compiling the class file 

		// Here w1 Refers to  Country
		World w1 =new Country();
		w1.Head();
		// Here w1 refers to a Village 
		w1 = new Village();
		w1.Head();

		


	}
}


// All the Classes have their own Constructors 
class World {

	// public World() {
	// 	System.out.println("This is the Wolrd, Biggest of all ");
	// }

	public void Head(){
		System.out.println("We are lead by Bunch of Organisations like UN , BRICS ,etc \n There is no Supreme Commanding us . Except the Almighty God");
	}

	public void Award(){
		System.out.println("The highest Award Considered is - THE NOBEL PRICE !");
	}

}

class Country extends World {

	// public Country() {
	// 	System.out.println("This is Country Smaller than the World ");
	// }

	@Override
	public void Head() {
		System.out.println("We are headed by Parliament , And our Choosen Leader is th President ");
	}

	@Override
	public void Award() {
		System.out.println("Award is Medal of Honour");
	}
}

class State extends Country {
	// public State() {
	// 	System.out.println("This is the State Smaller than a Country and Bigger than a Village !");
	// }

	@Override
	public void Head(){
		System.out.println("We are being headed by Chief Minister Choosen by Us ");
	}
	
}

class Village extends State {
	// public Village(){
	// 	System.out.println("This is Simply a Village !");
	// }

	@Override
	public void Head(){
		System.out.println("We are Being Lead by Sarpanch Choosen by the Village Panchayat !");
	}

}
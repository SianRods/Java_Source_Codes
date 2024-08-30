import java.util.Scanner;

public class JAbstraction {
	public static void main(String args[]){
	Dog d1 = new Dog();
	d1.sound();
	d1.legs();
			
		

	}	
}

// Note that the Abstract Class cannot be Instantaited and can be only be implemented 
//  bu using inheritance 
// All the abstract methods must be necessarily implemented 
// Helps Acheive 0 - 100 % Abstraction 

abstract class Solution{
	abstract void sound();
	public void legs(){
		System.out.println("This Animal Has Four LEGS ");
	}

}

class Dog extends Solution{
	public void sound(){
		System.out.println(" Dog : Baw Baw !");
	}


}
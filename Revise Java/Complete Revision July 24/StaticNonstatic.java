import java.util.Scanner;

public class StaticNonstatic {

	public static String name; // ---> Static Member belongs to the Class
	public int num; // ----> Non Static Member Belongs to the Each and Every instance of the class
	static Scanner sc = new Scanner(System.in);

	// Main Method 
	public static void main(String args[]){
		StaticMethod();
		StaticNonstatic obj = new StaticNonstatic();
		obj.nonStatic();
	}

	// Non Static Method 
	public void nonStatic() {
		System.out.println("My Name is : "+name);
		System.out.println("Enter any Number : ");
		num=sc.nextInt();
	}

	// Satic Method 
	public static void StaticMethod(){
		System.out.println("Enter your name : ");
		name=sc.next();
		System.out.println("The Number you have Entered is : "+name);
	}



}
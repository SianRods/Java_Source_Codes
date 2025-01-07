import java.util.Scanner;

// Collection of Objects can also be implemented using Lists like Arraylist and Vectors 

public class ArrayOfObjects {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Objects you want to make : ");
		int limit = sc.nextInt();
		Solution arr[] = new Solution[limit];

		// Adding all the objects
		for (int i = 0; i <limit; i++) {
			arr[i] = new Solution();
			
		}

		System.out.println("The given Array Consists of : " + arr.length + " Objects !");

		// Naming of Individual Objects of the Array

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Name of the "+(i+1)+" Object");
			arr[i].name=sc.next();
		}

		// Displaying the Names of all the objects in the given arrays 
		for(int i=0;i<arr.length;i++){
			System.out.println("The name of the "+(i+1)+" Object is : "+arr[i].name);
		}
	}

}

class Solution {
	public String name;

}
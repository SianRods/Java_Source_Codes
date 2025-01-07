import java.util.*;
public class StaticArrayMultiplication{
	
	static int arr[]={1,2,3,4,5};
	static int constant = 34;
	public static void main(String args[]){
		// MAIN METHOD CAN ACCESS THE CLASS VARIABLES /STATIC
		
		for(int i=0;i<arr.length;i++){
			arr[i]=arr[i]*(constant);
		}
			
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
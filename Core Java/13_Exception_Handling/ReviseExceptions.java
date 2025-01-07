import java.util.*;

public class ReviseExceptions {
	public static void main(String args[])  {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any Number : ");
		int num= sc.nextInt();
		try {
			
			NonNegativeValue.Display();
		} catch (NonNegativeValue e) {
			
		}
	}

}

// Creating a Seperate class For Implementing Custom Exceptions 
class NonNegativeValue extends Exception{
	public int value;
	public void NewExcep(int value){
		value=this.value;
	}
	public static  void Display() throws NonNegativeValue{
		if(-4<0){
			throw new NonNegativeValue();
		}else{
			System.out.println("Success");
		}
	}




}
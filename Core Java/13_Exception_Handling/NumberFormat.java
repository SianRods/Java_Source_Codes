import java.util.Scanner;

public class NumberFormat {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		int num ;
		System.out.println("Enter an Integer Number : ");
		num=sc.nextInt();
		try{
			throw new NumberFormatException();
		}catch(Exception E ){
			System.out.println(E);
		}
	}
}

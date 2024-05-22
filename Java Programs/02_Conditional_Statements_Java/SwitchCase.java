import java.util.Scanner;

public class SwitchCase {
	public static void main (String args[]){
		String name ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		name = sc.nextLine();
		switch(name ){
			case "sian": System.out.println("Hello Sian !!");
			break;
			case null : System.out.println("Kindly Enter a Name : ");
			break ;
			default : System.out.println("This is a Switch Case !!");
		}
	}


}

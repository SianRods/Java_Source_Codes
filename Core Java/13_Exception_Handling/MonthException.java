import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MonthException {
public static void main (String args[] )throws IOException{
	InputStreamReader ir = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(ir);
	// Scanner sc = new Scanner (System.in);

	int mnum ;
	System.out.println("Enter the Month : ");
	
	try{
		mnum=Integer.parseInt(br.readLine());
		
		if(mnum>12 || mnum<1){
			throw new MonthFormatException();
		}
	}catch(MonthFormatException e){
		e.printMessage();
	}
}
	
}

class MonthFormatException extends Exception{

	public void printMessage(){
		System.out.println("Enter Correct  Month Number !!!");
	}

}
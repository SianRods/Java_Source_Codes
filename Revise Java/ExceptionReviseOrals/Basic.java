import java.util.*;

public class Basic{
	public static void main(String[] args){
		
	}
}



class MyException extends Exception{
	@Override
	public void getMessage(){
		System.out.println("Hello World");
	}
}
import java.io.BufferedReader;

public class FileNotFoundException {
	public static void main (String args []){
		try{
		BufferedReader br = new BufferedReader("File.txt");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
}
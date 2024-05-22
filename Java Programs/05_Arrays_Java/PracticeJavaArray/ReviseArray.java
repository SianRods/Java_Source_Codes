
import java.util.Scanner;

public class ReviseArray {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		int arr [] = new int [15];
		for(int i=0;i<=10;i++){
			System.out.println("Enter your "+(i+1)+"Marks :");
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<=10;i++){
			System.out.println(arr[i]);
		}
	}
}

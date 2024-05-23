import java.util.Scanner;

public class SumOfSecondCol {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				System.out.println("Enter the Element "+(i+1)+(j+1)+"of the Matrix");
				arr[i][j]=sc.nextInt();
			}
		}

		// PRINTING THE ARRAY 
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				
				System.out.print("\t"+arr[i][j]);
			}
			System.out.println();
		}

		int sum =0;
		for(int i=0;i<arr.length;i++){
			sum +=arr[i][1];
		}

		System.out.println("The Sum of the Second Coloumn Elements is "+sum);
	}
}

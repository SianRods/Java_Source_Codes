import java.util.*;
public class SmallestElementColoumn {
	public static void main (String args[]){
		Scanner sc = new  Scanner(System.in);
		int arr[][]= new int[3][3];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println("Enter the Element "+(i+1)+(j+1)+"of the Matrix");
				arr[i][j]=sc.nextInt();
			}
		}

		// PRINTING THE ARRAY 
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				
				System.out.print("\t"+arr[i][j]);
			}
			System.out.println();
		}

		// ASSUMING THE ELEMENT IN THE FIRST COLOUMN IS THE MAXIMUM 
		int smallEle =0;

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[j][i]<arr[0][i]){
					smallEle =j;
				}
				
			}
			System.out.println("The Smallest Elemnt in the Coloumn :"+i+smallEle+"th Element");
		}

	}
}

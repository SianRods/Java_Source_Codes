import java.util.Scanner;

public class TwoDArray {
	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.print(arr[4]);
		Scanner sc = new Scanner(System.in);

		String name[][] = new String[4][3];

		// Matrix of the Format i*j

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i==0){
				System.out.println("Enter the Name of " + (j+ 1) + " student ");
				name[i][j]=sc.nextLine();
				}else {
					System.out.println("Enter the marks of the Student : ");
					name[i][j]=sc.next();
				}
			}
		}

		// Totaling thr Makrs of the Individual Student 
		int s1_total=0 ;
		int s2_total=0;
		int s3_total=0;

		for(int i=1;i<3;i++){
			s1_total += (int)name[i][0];
		}
		for(int i=1;i<3;i++){
			s2_total += (int)name[i][1];
		}
		for(int i=1;i<3;i++){
			s3_total += (int)name[i][2];
		}

		name[0][2]=s1_total;
		name[1][2]=s2_total;
		name[2][2]=s3_total;

		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				System.out.print(name[i][j]+ " ");
			}
			System.out.println();
		}


	}
}

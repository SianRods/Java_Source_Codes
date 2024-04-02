import java.util.Scanner;

public class Exp6B {
    public static void main(String[] args) {
        // Depending upon the no of Students and also on the no of Subjects we will
        // Decide the size of 2D Array
        int m, n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students : ");
        m = sc.nextInt();
        System.out.println("Enter the number of Subjects : ");
        n = sc.nextInt();
        int data[][] = new int[m][n + 2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n + 2; j++) {
                // Taking RollNo Of Students in the first Coloumns
                if (j==n+2-1){
                    data[i][j]=sum;
                }
                if (j == 0) {
                    System.out.println("Enter the Roll No of the" + (i + 1) + "Student ");
                    data[i][j] = sc.nextInt();
                } else if (j != 0 || j !=n+2-1 ) {
                    System.out.println("Enter the Marks of Student in Subject No." + (j) + "");
                    data[i][j] = sc.nextInt();
                    sum = sum + data[i][j];
                  
                } 

            }
            sum =0;
        }

        // Printing the Coloumn Along with the Total Marks in Matrix Form

        for (int i = 0; i < m; i++) {
            for (int k = 0; k < n + 2; k++) {
                System.out.print(data[i][k]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
}

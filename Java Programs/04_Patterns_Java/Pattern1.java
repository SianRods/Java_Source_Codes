// package Java Programs.Patterns_Java;
import java.util.Scanner;
public class Pattern1 {
    public static void main(String args[]){
        // Printing Star Pattern in C 
        int i,j,rows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows You Want : ");
        rows=sc.nextInt();
        for (i=1;i<=rows;i++){
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            // Printing new line at the end of each row 
            System.out.print("\n");
        }
    }
}


import java.util.Scanner;
public class Problem2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        // Adding a Blank String Does the Job of Eating up the Carried Forward NewLine Character 
        String blank = scan.nextLine();
        String  s =scan.nextLine();
        
        
        // Write your code here.

        System.out.println("String: " +s);
        System.out.println("Double: " +d);
        System.out.println("Int: " +i);
    }

}

// Problem 
/*
 * The Input for the staring is not available 
 *  Solution --> 
 * Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).
 * 
 */
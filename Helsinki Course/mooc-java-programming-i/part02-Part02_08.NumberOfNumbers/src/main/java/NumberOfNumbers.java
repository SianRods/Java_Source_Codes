
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // The zero that's used to exit the loop should not be included in the total
        // number count.
        // Here we have to itereate through the loop and set the counter such that we
        // get only
        // the number of inputs before zero
        // Using the do while loop here as the condition is to be checked after the
        // input has been taken

        int i = -1;
        int num;
        do {
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());
            i++;
        } while (num != 0);
        System.out.println("");
// We have to print (i-1) --> if we start from i=0 ;
//  Print i if we start from i =-1;


        System.out.println("Number of numbers: "+i);
    }
}


import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        double num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        double num2 =Integer.valueOf(scanner.nextLine());
        double avg = (num1+num2)/2 ;
        // The numbers which are to be taken as the input should be also strictly 
        // Double or the integer inputs will result in the rounded off value 
        System.out.println("The average is "+avg);

    }
}


import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // We have to take the inputs as integers Only
        // So we need to typecast them so that they can be divided properly 
         System.out.println("Give the first number:");
         int  num1 =Integer.valueOf(scanner.nextLine());
         System.out.println("Give the second number:");
         int  num2 = Integer.valueOf(scanner.nextLine());
         System.out.println("Give the third number:");
         int  num3 =Integer.valueOf(scanner.nextLine());
         double sum = ((double)num1 + (double)num2 +(double)num3)/3;
         System.out.println("The average is "+sum);
    }
}

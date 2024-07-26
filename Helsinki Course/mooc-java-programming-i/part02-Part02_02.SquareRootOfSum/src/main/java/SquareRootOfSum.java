
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Calculating the Sqaure root of a number using an inbuilt maths function
        int num1 =Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());
        int sum = num1 +num2 ;
        double result = Math.sqrt((double)sum);
        System.out.println(result);

    }
}

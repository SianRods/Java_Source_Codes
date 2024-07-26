
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Write your program here
        // Assuming Integer Inputs 
        // Simple Calculator 
        // Using Reference Data Types --> Wrapper Classes For Methods Access
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(sc.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(sc.nextLine());
        int sum = num1 +  num2 ;
        int sub = num1 - num2 ;
        int mul = num1*num2;
        // Using Typcasting for purpose of division
        double division = (double)num1 / (double)num2 ;
        System.out.println(num1+" + "+num2+" = "+sum);
        System.out.println(num1+" - "+num2+" = "+sub);
        System.out.println(num1+" * "+num2+" = "+mul);
        System.out.println(num1+" / "+num2+" = "+division);
    }
}

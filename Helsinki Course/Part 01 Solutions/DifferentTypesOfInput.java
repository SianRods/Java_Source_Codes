
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Write your program here
        // We will be using the Wrapper Classes Method to convert the String Values to  Datatypes
        System.out.println("Give a string:");
        String string =sc.nextLine();
        System.out.println("Give an integer:");
        int num = Integer.valueOf(sc.nextLine());
        System.out.println("Give a double:");
        double deci = Double.valueOf(sc.nextLine());
        System.out.println("Give a boolean:");
        boolean val = Boolean.valueOf(sc.nextLine());
        System.out.println("You gave the string "+string);
        System.out.println("You gave the integer "+num);
        System.out.println("You gave the double "+deci);
        System.out.println("You gave the boolean "+val);


    }
}

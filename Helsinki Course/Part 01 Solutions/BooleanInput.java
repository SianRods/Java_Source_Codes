
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Write something:");
        String sentence =scanner.nextLine();
        // Using the reference data methods to take the inputs 
        // boolean value =Boolean.valueOf(scanner.nextLine());
        System.out.print("True or false? ");
        boolean value =Boolean.valueOf(scanner.nextLine());
    }
}

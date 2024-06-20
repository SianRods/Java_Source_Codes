
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");
        double value = Double.valueOf(scanner.nextLine());
        // Note that the Double class is a wrapper class hence here we can use its Method to direclty 
        // convert the string value to the double using - valueOf() function;
        System.out.println("You gave the number "+value   );
    }
}

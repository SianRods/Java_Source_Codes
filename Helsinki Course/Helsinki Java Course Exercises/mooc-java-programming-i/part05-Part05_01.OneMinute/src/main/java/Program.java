
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here
        Timer t = new Timer();
        while (true) {
            System.out.println(t); // Printing the message using the toString() Method
            t.advance();
        }

    }
}


import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        String word;
        System.out.println("Give a word:");
        word=scanner.nextLine();

        System.out.print(word);
        System.out.print(word);
        System.out.print(word);
    }
}

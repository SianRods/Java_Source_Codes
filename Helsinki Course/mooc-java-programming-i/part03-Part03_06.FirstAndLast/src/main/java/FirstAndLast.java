
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        // Printing the first and the last element
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));

    }
}

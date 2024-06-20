import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Implementing the While Loop
        while (true) {
            System.out.println("Name:");
            String showName = scanner.nextLine();
            if (showName.isEmpty()) {
                break;
            }
            System.out.println("Duration: ");
            int showDurationMinutes = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(showName, showDurationMinutes));
        }

        // Printing the Required Shows depending upon the Entered Condtion
        System.out.println("Program's maximum duration?");
        int limit = Integer.valueOf(scanner.nextLine());

        // Using the List to iterate through it and then find out the required Timing
        // Condition

        for (int i = 0; i < programs.size(); i++) {
            if (programs.get(i).getDuration() <= limit) {
                System.out.println(programs.get(i));
            }
        }

    }
}

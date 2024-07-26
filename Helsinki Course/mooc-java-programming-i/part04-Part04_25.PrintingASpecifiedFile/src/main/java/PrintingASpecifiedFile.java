
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String FILE_NAME;
        System.out.println("Which file should have its contents printed?");
        FILE_NAME = scanner.nextLine();
        try {
            Scanner FILE_SCANNER = new Scanner(Paths.get(FILE_NAME));
            while (FILE_SCANNER.hasNextLine()) {
                // Printing the File Line Wise
                String line = FILE_SCANNER.nextLine();
                System.out.println(line);

            }

        } catch (Exception e) {
            System.out.println("Unexpected Error Has Occured !");
        }
    }
}

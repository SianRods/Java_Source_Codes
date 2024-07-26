
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);

            // CODE FOR COMPARING THE ABOVE FORMED OBJECT WITH ALL OTHERS OBJECTS FROM THE
            // LIST BEFORE ADDING IT

            // Using a BOOLEAN VARIABLE TO FINALLY ADD THE BOOK OBJECT TO THE LIST        books.add(book);
            boolean value = false;
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).equals(book)) {
                    value = true;
                    break;
                } else {
                    continue;
                }
            }
            if (!value) {
                books.add(book);
            }

        }

        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter
        // book information and to examine them
        ArrayList<Book> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Code is Throwing an Error Due to Incorrect Formatting Check the Format Again


        // while (true) {
        //     System.out.print("Title: ");
        //     String name = sc.nextLine();
        //     if (name.isEmpty()) {
        //         break;
        //     }
            
        //     System.out.print("Pages:");
        //     String pages = sc.nextLine();
        //     System.out.println();
        //     System.out.print("Publication year:");
        //     int year = Integer.valueOf(sc.nextLine());
        //     System.out.println();
        //     // Adding all the Data to the Lists

        //     list.add(new Book(name, pages, year));
        // }

        System.out.print("What information will be printed?");
        String ans = sc.nextLine();
        if (ans.equalsIgnoreCase("everthing")) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        } else if (ans.equalsIgnoreCase("name")) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).name());
            }
        }

    }
}


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // USING ARRAYLIST TO STORE THE OBJECTS

        ArrayList<Item> list = new ArrayList<>();

        while (true) {
            String id;
            String name;
            System.out.println("Identifier? (empty will stop)");
            id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Item archive = new Item(name, id);

            list.add(archive);

        }

        System.out.println("==Items==");
        // REMOVING REPETETIVE ITEMS FROM THE LIST 
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i != j && list.get(i).equals(list.get(j))) {
                    if (i > j) {
                        list.remove(i);
                    } else if (j > i) {
                        list.remove(j);
                    }
                }
            }
        }

        // PRINTING THE LIST
        for(int l=0;l<list.size();l++){
            System.out.println(list.get(l));
        }

    }
}

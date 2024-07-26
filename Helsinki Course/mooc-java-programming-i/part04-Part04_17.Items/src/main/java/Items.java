
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // Lists only take the refereced data types  
        while (true) {
            String name ;
            System.out.println("Name:");
            name=scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            // Passing the Name to the Objects Constructors
            items.add(new Item(name));
            
        }

        // We have tp print all the objects of the items , hence we use the for loop
        for(int i=0;i<items.size();i++){
            System.out.println(items.get(i));
        }



    }
}

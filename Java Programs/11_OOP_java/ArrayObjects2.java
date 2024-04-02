import java.util.*;

public class ArrayObjects2 {
    public static void main(String args[]) {
        Food f1 = new Food("Vadapav", "2");
        Food f2 = new Food("Misal Pav ", "5");
        Food f3 = new Food("Kurma ", "0");

        // Creating an Array of Similar class objects using the class names itself ;

        Food list[] = { f1, f2, f3 };
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}

class Food {
    String name;
    String SpicyScale;

    Food(String name, String SpicyScale) {
        // Creating unique attribuurtes for the objects of Class 'FOOD'
        this.name = name;
        this.SpicyScale = SpicyScale;
    }
    @Override
    public String toString() {
       return name+SpicyScale;
    }
    
    
}

import java.util.Vector;

public class Vectors {
    public static void main(String args[]) {
        Vector<String> name = new Vector<>();
        name.add("Sian");
        name.add("Smayan");
        name.add("Gadge ");
        // Printing the Vectors just like an array
        for(int i=0;i<name.size();i++){
            System.out.println(name.elementAt(i));
        }
    }
}


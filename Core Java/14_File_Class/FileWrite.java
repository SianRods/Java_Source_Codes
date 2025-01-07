import java.util.*;
import java.io.FileWriter;
// FileWrite is a Class i Java Which lets you write on a given File 
import java.io.IOException;

public class FileWrite {
    public static void main (String args[]){
        // Creating an Instance if the File Class 
        // There are different types of Constructors to be used with the FileWriter class
        // It depends on the individual UseCase 
        try {
            FileWriter write_file = new FileWriter("Hello World.txt");
            write_file.write("I am trying to learn FileHandling using Java \n So far its been fun learning Java ");
            // We are required to close the FileWriter Class Using its object after it has been Used 
            write_file.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

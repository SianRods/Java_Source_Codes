import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/*
--> FileReader class reads the content of a file as the stream of characters .One by one 
read returns an int value which contents the byte value .  When read returns '-1' there is no more Data to be read   
*/ 

//  It is important to note that as the read class returns an 'Integer' Value we have to type cast the 'integer' value to 'char'
public class FileRead {
    public static void main(String args[]){
        try {
            FileReader file_read = new FileReader("Hello World.txt");
            // Creating an integer type variable to read the vallue from file 
            int data = file_read.read();
            // Using the while Loop till the Value of '-1' is not received and hence the iteration continues 
            while (data != -1 ) {
                System.out.print((char)data);
                // Reading the Data Again 
                data = file_read.read();
            }


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

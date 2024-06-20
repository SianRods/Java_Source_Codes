// Importing the required packages
import java.nio.file.Paths;
import java.util.Scanner;

/*
 * In this exercise we will be learning about file handling without importing the file class 
 * using an object of the scanner class
 * 

 */


public class PrintingAFile {

    public static void main(String[] args) {
    try{    Scanner sc = new Scanner(Paths.get("data.txt"));
        while(sc.hasNextLine()){
            // Reading one line at a time using the scannerobject 
            String line = sc.nextLine();
            System.out.println(line);
        }
    }catch(Exception e){
        System.out.println("Exception has Occured !");
    }
    }
}

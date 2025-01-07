import java.io.File; //-->  Required Package To be Imported 
import java.util.*;
// Using the File Class and its various methods to handle Files using Java 
public class FileBase {
    public static void main(String args[]){
        File fileHandle = new File("Hello World.txt");

        //  Checking if the File Exists using the fileHandle.exists() --> Methods which returns a boolean expression
       if(fileHandle.exists()){
        System.out.println("This File Exists ");
       } else {
        System.out.println("The file does not exists !");
       }
    //  It is Important to note that if the file is not located within the parent folder of     project it is important to mention the entire file path of the required File 

// Using Get Path Method to print the Path of the File 

System.out.println(fileHandle.getPath()); // Only Given Incomplelete Path 

//  In order to obetain the complete path of a given file on a Computer 
//  objectName.getAbsolutePath();
System.out.println(fileHandle.getAbsolutePath());

// To check a file is a File or A folder we can use the objectName.isFile(); --> Methods of the File Class 
// ifFile() Method --> Returns a Boolean Value 
System.out.println(fileHandle.isFile());

// Using the File Delete Funtion --> Any file in our Computers PATH can be deleted 
// fileHandle.delete();  --> Running this opereation will simply delete the file        

}
}


// Footnotes on File Class In Java
/* 1). Syntax of decalring the file class in java 

 File objectName = new File("NameofTheFile.TypeOfFile");



 */
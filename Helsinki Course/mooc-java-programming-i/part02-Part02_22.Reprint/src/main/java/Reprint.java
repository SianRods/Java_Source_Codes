
import java.util.Scanner;
// In this program we have to define the number of times the method is called and not the 
// time the sentence is repeated inside the loop of the method
public class Reprint {

    public static void main(String[] args) {
        // ask the user for how many times should the text be printed
        // then call the printText-method multiple times with a while-loop
        
        Scanner scanner = new Scanner(System.in);
        int n ;
        System.out.println("How many times?");
        n=Integer.valueOf(scanner.nextLine());
        for(int i=1;i<=n;i++){
            printText();
        }
    }
    
    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        // write some code here
        System.out.println("In a hole in the ground there lived a method");
    }
}

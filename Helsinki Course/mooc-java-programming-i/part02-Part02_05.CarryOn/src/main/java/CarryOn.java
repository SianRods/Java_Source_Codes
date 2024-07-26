
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Here we have to use the exit level loop 
        String input ;
        String pass ="no";
        
        do{
            
            System.out.println("Shall we carry on?");
            input=scanner.nextLine();
            
        } while(!input.equals(pass));
        // Using the not expression is the requirement 
        }
    }



import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Write your program here.
        // Using the Equals Method to check the equality of the strings
        System.out.println("Enter the first string:");
        String pass =sc.nextLine();
        System.out.println("Enter the second string:");
        String realpass =sc.nextLine();
        if(pass.equalsIgnoreCase(realpass)){
            System.out.println("Same");
        } else{
            System.out.println("Different");
        }    
    }

}

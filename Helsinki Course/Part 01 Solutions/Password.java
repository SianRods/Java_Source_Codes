
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Write your program here 
        // Solution
        // While comparing all the other value except String we cannot use the 
        // Equality operator we have to use the String Method 
        //  string.equals("A String ")  --> Returns a Boolean Value 
        System.out.println("Password?");
        String pass =sc.nextLine();
        String realpass ="Caput Draconis";
        if(pass.equalsIgnoreCase(realpass)){
            System.out.println("Welcome!");
        } else{
            System.out.println("Off with you!");
        }
    }
}

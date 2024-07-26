
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String user1 = "alex";
        String user2 ="emma";
        String pass1 = "sunshine";
        String pass2="haskell";

        String inputuser;
        String inputpass;

        System.out.print("Enter username:");
        inputuser =scanner.nextLine();
        System.out.print("Enter password:");
        inputpass =scanner.nextLine();

        //  To check we will use the  if - else condition
        // Here we have to use the equals methods
        if(inputuser.equals(user1) || inputuser.equals(user2)){
            if((inputuser.equals(user1)&&inputpass.equals(pass1)) || (inputuser.equals(user2)&&inputpass.equals(pass2))){
                System.out.println("You have successfully logged in!");
            }else{
                System.out.println("Incorrect username or password!");
            }
        }

    }
}

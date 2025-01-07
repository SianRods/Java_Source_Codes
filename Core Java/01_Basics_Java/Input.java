import java.util.Scanner;
// The Scanner Class which is being Imported will have mutiple methods and functions 
//Which can be accessed by using a user created  object of Scanner Class 
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Your Age : ");
        int Age ;
        Age  = sc.nextInt();
        System.out.println("Your Age is now : "+Age);
    }
}

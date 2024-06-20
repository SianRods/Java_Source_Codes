
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Give speed:");
        // Using the Wrapper Classes
        int speed = Integer.valueOf(sc.nextLine());
        if (speed>120){
            System.out.println("Speeding ticket!");
        }
    }
}

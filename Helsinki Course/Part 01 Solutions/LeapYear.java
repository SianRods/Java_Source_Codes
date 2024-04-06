
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Understanding the Logic of Leap Year is very important here 
        // Logic -->
        // The year is multiple of 400.
        // The year is a multiple of 4 and not a multiple of 100.

        System.out.print("Give a year:");
        int year =Integer.valueOf(sc.nextLine());
        if (year%4==0 && year%400==0){
            // If it is Divisible by 100
            if(year%100==0 ){
                    System.out.println("The year is not a leap year.");
            }
            System.out.println("The year is a leap year.");
        }
    }
}

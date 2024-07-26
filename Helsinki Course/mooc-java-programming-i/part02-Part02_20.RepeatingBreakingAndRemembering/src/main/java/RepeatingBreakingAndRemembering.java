
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        // Do while loop --> Part 1
        int num ;
        int sum =1; // Cancelling out the effect of '-1 '
        int i=-1;
        int j=0;
        System.out.println("Give numbers:");
        do{
            num=Integer.valueOf(scanner.nextLine());
            if(num%2==0){
                j ++;
            }
            sum+=num;
            i++;
        } while (num!=-1);
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+sum);
        System.out.println("Numbers: "+i);
        double avg =((double)sum)/i;
        System.out.println("Average: "+avg);
        int odd =(i-j);     // Where i is quatity excluding '-1'
        System.out.println("Even: "+j);
        System.out.println("Odd: "+odd);



        // Part 2 
        // adding the Sum feature 
        // Part 3 intializing a loop iterator
        // Finding the average needs --> Type casting 
        // In order to print even and odd numbers for given set of integers 
        // we need one specific even counter and the odd will be just total -no of even


    }
}

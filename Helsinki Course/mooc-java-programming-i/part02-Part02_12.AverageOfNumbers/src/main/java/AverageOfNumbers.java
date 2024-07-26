
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Zero is to be excluded 
        // Double value --> Type casting is needed 
        int sum =0;
        int num;
        int i=-1;
        do{
            System.out.println("Give a number:");
            num=Integer.valueOf(scanner.nextLine());
            sum +=num;
            i++;
        } while(num!=0);
        double avg =((double)sum/i);
        System.out.println("Average of the numbers: "+avg);
    }
}

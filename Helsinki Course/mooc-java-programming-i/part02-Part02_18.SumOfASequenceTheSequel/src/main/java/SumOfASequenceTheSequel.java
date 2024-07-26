
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int limit;
        int start;
        System.out.print("First number?");
        start=Integer.valueOf(scanner.nextLine());
        System.out.print("Last number?");
        limit=Integer.valueOf(scanner.nextLine());
        for(int i=start;i<=limit;i++){
            sum +=i;
        }
        // Printing the value of the Sum
        System.out.println("The sum is "+sum);

    }
}
